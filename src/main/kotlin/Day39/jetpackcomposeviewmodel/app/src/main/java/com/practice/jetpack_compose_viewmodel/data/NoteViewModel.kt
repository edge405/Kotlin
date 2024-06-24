package com.practice.jetpack_compose_viewmodel.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteViewModel : ViewModel() {
    private val _notes = MutableLiveData<List<Note>>(emptyList())
    val notes: LiveData<List<Note>> = _notes

    fun addNote(note: Note){
        _notes.value = _notes.value?.plus(note)
    }
    fun deleteNote(note: Note){
        _notes.value = _notes.value?.minus(note)
    }
}