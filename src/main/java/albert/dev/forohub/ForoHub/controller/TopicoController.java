package albert.dev.forohub.ForoHub.controller;

import albert.dev.forohub.ForoHub.domain.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    private ResponseEntity<TopicoDataResponse> submitTopico(@RequestBody @Valid TopicoDataRecord topicoDataRecord, UriComponentsBuilder uriComponentsBuilder){
            Topico topico = topicoRepository.save(new Topico(topicoDataRecord));
            TopicoDataResponse topicoDataResponse = new TopicoDataResponse(topico.getId(),topico.getTitle(),
                    topico.getMessage(),topico.getCreationDate(),topico.getStatus(),topico.getUser(),topico.getSubject(),topico.getAnswers());
        URI url =uriComponentsBuilder.path("/topico/${id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(topicoDataResponse);
    }
    @GetMapping
    private Page<TopicDataRecordList> getTopicos(@PageableDefault Pageable pagination){
        return topicoRepository.findAll(pagination).map(TopicDataRecordList::new);
    }
    @GetMapping("/{id}")
    private ResponseEntity<TopicoDataResponse> topicoById(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        var topicData = new TopicoDataResponse(topico.getId(),topico.getTitle(),
                topico.getMessage(),topico.getCreationDate(),topico.getStatus(),topico.getUser(),topico.getSubject(),topico.getAnswers());
        return ResponseEntity.ok(topicData);
    }

    @PutMapping
    @Transactional
    private ResponseEntity<TopicoDataResponse>  updateTopico(@RequestBody @Valid UpdateTopicDTO updateTopicDTO){
        Topico topico = topicoRepository.getReferenceById(updateTopicDTO.id());
        topico.updateData(updateTopicDTO);
        return ResponseEntity.ok(new TopicoDataResponse(topico.getId(),topico.getTitle(),
                topico.getMessage(),topico.getCreationDate(),topico.getStatus(),topico.getUser(),topico.getSubject(),topico.getAnswers()));
    }
    @DeleteMapping("/{id}")
    @Transactional
    private ResponseEntity<TopicoDataResponse> deleteTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
        return ResponseEntity.noContent().build();
    }

}
