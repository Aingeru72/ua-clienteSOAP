<%@include file="/templates/head.jsp"%>
<%@include file="/templates/navbar.jsp"%>

<h1>UNIVERSIDAD DE ALICANTE</h1>

<div class="col-sm-8">
	<h2>Alojamientos</h2>

	<c:forEach items="${alojamientos}" var="alojamiento" begin="0" end="9">
		<hr>
		<h3>${alojamiento.descripcionzona}</h3>
		<p>
			<b>Dirección: </b> ${alojamiento.direccion}
		</p>
		<p>
			<b>Precio: </b> ${alojamiento.precio} &euro;
		</p>
		<p>
			<b>Plazas: </b> ${alojamiento.plazas}
		</p>
		<p>
			<b>Observaciones: </b> ${alojamiento.observaciones}
		</p>
		<p>
			<b>Contacto: </b> ${alojamiento.contacto} <a
				href="mailto:${alojamiento.emailcontacto}">${alojamiento.emailcontacto}</a>
		</p>
	</c:forEach>
</div>

<jsp:include page="templates/footer.jsp"></jsp:include>