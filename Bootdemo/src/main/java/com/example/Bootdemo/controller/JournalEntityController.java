package com.example.Bootdemo.controller;

import com.example.Bootdemo.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntityController {

private Map<Long, JournalEntry> JournalEntries=new HashMap<>();

@GetMapping
public List<JournalEntry> getAll(){

    return new ArrayList<>(JournalEntries.values());
}

@PostMapping
public boolean CreateEntry(@RequestBody JournalEntry myentry){
JournalEntries.put(myentry.getId(),myentry);
return true;
}

@GetMapping("id/{myId}")
public JournalEntry GetEntryById(@PathVariable Long myId){
    return JournalEntries.get(myId);

}

@DeleteMapping("id/{myId}")
public JournalEntry DeleteEntryById(@PathVariable Long myId){
return JournalEntries.remove(myId);
}

    @PutMapping("id/{id}")
    public JournalEntry UpdateEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry){
        return JournalEntries.put(id,myEntry);
    }
}
