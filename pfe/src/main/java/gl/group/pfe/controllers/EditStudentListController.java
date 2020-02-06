package gl.group.pfe.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gl.group.pfe.common.exceptions.NotFoundException;
import gl.group.pfe.ports.in.EditStudentListUseCase;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * EditStudentListController
 */
@RestController
@RequestMapping("students/{id}/list")
@RequiredArgsConstructor
public class EditStudentListController {

    private final EditStudentListUseCase editStudentListUseCase;

    @PutMapping(produces = "application/json")
    public ResponseEntity<Void> putMethodName(@RequestBody EditStudentListUseCase.EditStudentListCommand command) {
        return null;
        // editStudentListUseCase.editList(command); Exception handling (runtime)
    }

}