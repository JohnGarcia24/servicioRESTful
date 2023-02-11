package com.h2.h2api.servicio;

import com.h2.h2api.modelo.Usuario;
import com.h2.h2api.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class ServicioUsuarioImpl implements ServicioUsuario{

    private final RepositorioUsuario repositorioUsuario;
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @Override
    public Optional<Usuario> obtenerUsuario(Long idUsuario) {
        return repositorioUsuario.findById(idUsuario);
    }

    @Override
    public Usuario usuarioAModificar(Long id, Usuario usuarioModificar) {
        Usuario usuarioBuscado = repositorioUsuario.findById(id).get();
        usuarioBuscado.setNombreCliente(usuarioModificar.getNombreCliente());
        usuarioBuscado.setFechaNaciminetoCliente(usuarioModificar.getFechaNaciminetoCliente());
        usuarioBuscado.setCiudadResidenciaClente(usuarioModificar.getCiudadResidenciaClente());
        usuarioBuscado.setDireccionCliente(usuarioModificar.getDireccionCliente());
        return repositorioUsuario.save(usuarioBuscado);
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        try{
            repositorioUsuario.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
