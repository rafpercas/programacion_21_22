package U4.Perez_Castano_U4_T1_Entrega;

public class Material {
  private String descripcion;
  private String proveedor;
  private Integer udsNecesarias;
  private float precioUnidad;
  public static Integer IVA = 21;

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getProveedor() {
    return proveedor;
  }

  public void setProveedor(String proveedor) {
    this.proveedor = proveedor;
  }

  public Integer getUdsNecesarias() {
    return udsNecesarias;
  }

  public void setUdsNecesarias(Integer udsNecesarias) {
    if (udsNecesarias >= 1 && udsNecesarias <= 1000) {
      this.udsNecesarias = udsNecesarias;
    }
  }

  public float getPrecioUnidad() {
    return precioUnidad;
  }

  public void setPrecioUnidad(float precioUnidad) {
    if (precioUnidad >= 0 && precioUnidad <= 100000) {
      this.precioUnidad = precioUnidad;
    }
  }

  public static Integer getIVA() {
    return IVA;
  }

  public static void setIVA(Integer IVA) {
    Material.IVA = IVA;
  }

  public Material(String descripcion, String proveedor, Integer udsNecesarias, float precioUnidad) {
    this.descripcion = descripcion;
    this.proveedor = proveedor;
    this.udsNecesarias = udsNecesarias;
    this.precioUnidad = precioUnidad;
  }

  public Material(String descripcion, Integer udsNecesarias, float precioUnidad) {
    this.descripcion = descripcion;
    this.udsNecesarias = udsNecesarias;
    this.precioUnidad = precioUnidad;
  }

  public void mostrar_informacion() {
    System.out.println("Descripción: "+getDescripcion());
    System.out.println("Proveedores: "+getProveedor());
    System.out.println("Unidades necearias: "+getUdsNecesarias());
    System.out.println("Precio por unidad: "+getPrecioUnidad()+"€");
    System.out.println("IVA: "+getIVA()+"%");
  }
  public static void cambiarIVA(Integer nuevoIVA){
    IVA = nuevoIVA;
  }
}
