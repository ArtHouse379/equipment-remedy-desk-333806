package lwhoistrepairinspection.machinery.equipmentremedydesk.data.repository

import lwhoistrepairinspection.machinery.equipmentremedydesk.data.model.ServiceCategory
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.model.ServiceModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ServiceRepository {
    private val services: List<ServiceModel> = listOf(
        ServiceModel(
            id = 1,
            name = "Industrial Machine Repair",
            description = "An engineer diagnoses mechanical faults in production machinery and identifies the parts or adjustments required. Worn components are repaired or replaced where practical, then alignment and movement are checked. The machine is test-run under safe conditions before return to service. A concise repair record notes the work completed and any follow-up actions.",
            serviceCategory = ServiceCategory.MECHANICAL_REPAIR,
            pricePerHour = 125.00,
            imageUrl = "https://images.pexels.com/photos/6720526/pexels-photo-6720526.jpeg",
            includedItems = listOf("Mechanical fault diagnosis", "Component adjustment", "Operational test", "Repair record"),
        ),
        ServiceModel(
            id = 2,
            name = "Machine Tool Maintenance",
            description = "A technician services moving parts, guides, drive components, and accessible lubrication points on an industrial machine tool. Fasteners, guards, and common wear areas are checked during the visit. Minor adjustments are completed to improve reliable operation and reduce premature wear. Any defects requiring additional work are documented for planning.",
            serviceCategory = ServiceCategory.MECHANICAL_REPAIR,
            pricePerHour = 110.00,
            imageUrl = "https://images.pexels.com/photos/18845071/pexels-photo-18845071.jpeg",
            includedItems = listOf("Wear inspection", "Lubrication check", "Minor adjustments", "Maintenance report"),
        ),
        ServiceModel(
            id = 3,
            name = "Control Panel Repair",
            description = "An electrical engineer traces faults within an industrial control panel using appropriate test equipment. Connections, protective devices, relays, and control wiring are inspected for damage or abnormal readings. Approved minor repairs and component changes are completed where the fault can be safely isolated. Functional checks confirm the repaired circuit responds correctly.",
            serviceCategory = ServiceCategory.ELECTRICAL_SYSTEMS,
            pricePerHour = 135.00,
            imageUrl = "https://images.pexels.com/photos/14319099/pexels-photo-14319099.jpeg",
            includedItems = listOf("Electrical fault tracing", "Control wiring check", "Minor component repair", "Functional testing"),
        ),
        ServiceModel(
            id = 4,
            name = "Industrial Electrical Maintenance",
            description = "A planned maintenance visit checks industrial electrical equipment for loose connections, overheating indicators, wear, and enclosure damage. Technicians inspect accessible panels and controls in line with the agreed isolation arrangements. Suitable connections are secured and minor defects are corrected during the visit. Findings and recommended priorities are recorded for the maintenance team.",
            serviceCategory = ServiceCategory.ELECTRICAL_SYSTEMS,
            pricePerHour = 120.00,
            imageUrl = "https://images.pexels.com/photos/10871585/pexels-photo-10871585.jpeg",
            includedItems = listOf("Panel condition check", "Connection inspection", "Minor defect correction", "Priority findings"),
        ),
        ServiceModel(
            id = 5,
            name = "Machinery Condition Inspection",
            description = "An engineer examines machinery condition, operating behaviour, guarding, and visible signs of deterioration. Available maintenance history and operator observations are reviewed to focus the inspection. Findings are ranked by urgency and supported with practical maintenance recommendations. The visit provides a clear snapshot for repair and reliability planning.",
            serviceCategory = ServiceCategory.INSPECTION_DIAGNOSTICS,
            pricePerHour = 105.00,
            imageUrl = "https://images.pexels.com/photos/32845694/pexels-photo-32845694.jpeg",
            includedItems = listOf("Visual condition survey", "Operating review", "Defect priorities", "Inspection report"),
        ),
        ServiceModel(
            id = 6,
            name = "Equipment Fault Diagnosis",
            description = "A diagnostic engineer investigates recurring stops, unusual noise, vibration, heat, or reduced machine performance. Evidence is gathered from operator reports, machine behaviour, and accessible mechanical or electrical checks. Likely root causes are separated from secondary symptoms before repair options are proposed. The resulting fault report helps avoid unnecessary part replacement.",
            serviceCategory = ServiceCategory.INSPECTION_DIAGNOSTICS,
            pricePerHour = 130.00,
            imageUrl = "https://images.pexels.com/photos/5503874/pexels-photo-5503874.jpeg",
            includedItems = listOf("Symptom review", "Targeted testing", "Root-cause assessment", "Repair recommendations"),
        ),
        ServiceModel(
            id = 7,
            name = "Maintenance Planning Consultation",
            description = "An engineering consultant reviews the equipment register, maintenance workload, failure history, and production priorities. Existing preventive tasks are assessed for relevance and practical scheduling. The consultant develops a prioritised plan covering routine work, critical spares, and condition checks. Recommendations are explained with the site team so they can be put into use.",
            serviceCategory = ServiceCategory.ENGINEERING_CONSULTING,
            pricePerHour = 150.00,
            imageUrl = "https://images.pexels.com/photos/8278933/pexels-photo-8278933.jpeg",
            includedItems = listOf("Maintenance review", "Criticality priorities", "Task schedule", "Implementation briefing"),
        ),
        ServiceModel(
            id = 8,
            name = "Machinery Upgrade Consultation",
            description = "An engineer assesses an existing machine and discusses the required improvement in capacity, reliability, control, or safety. Technical constraints, interfaces, and downtime requirements are identified before options are compared. The consultation outlines a practical upgrade scope with key risks and budget considerations. This gives the site a sound basis for supplier quotations and project decisions.",
            serviceCategory = ServiceCategory.ENGINEERING_CONSULTING,
            pricePerHour = 165.00,
            imageUrl = "https://images.pexels.com/photos/8961071/pexels-photo-8961071.jpeg",
            includedItems = listOf("Site requirements review", "Upgrade options", "Risk considerations", "Scope summary"),
        ),
        ServiceModel(
            id = 9,
            name = "Machine Operator Training",
            description = "A trainer gives operators practical instruction on normal machine controls, pre-use checks, safe working limits, and correct shutdown. The session uses the site machine and its documented procedures wherever possible. Participants practise routine operation while the trainer corrects unsafe or inefficient habits. Key learning points and attendance are recorded after the session.",
            serviceCategory = ServiceCategory.OPERATOR_TRAINING,
            pricePerHour = 115.00,
            imageUrl = "https://images.pexels.com/photos/3846262/pexels-photo-3846262.jpeg",
            includedItems = listOf("Pre-use checks", "Control instruction", "Supervised practice", "Training record"),
        ),
        ServiceModel(
            id = 10,
            name = "Machine Maintenance Training",
            description = "Maintenance personnel learn a structured approach to routine inspection, lubrication, adjustment, and early fault recognition. Training links each task to equipment condition and safe isolation requirements. Demonstrations are followed by supervised hands-on practice using relevant machinery. The session helps teams perform consistent maintenance and report developing defects clearly.",
            serviceCategory = ServiceCategory.OPERATOR_TRAINING,
            pricePerHour = 125.00,
            imageUrl = "https://images.pexels.com/photos/11765538/pexels-photo-11765538.jpeg",
            includedItems = listOf("Inspection routine", "Lubrication guidance", "Fault recognition", "Hands-on practice"),
        ),
    )

    fun observeAll(): Flow<List<ServiceModel>> {
        return flowOf(services)
    }

    fun observeById(id: Int): Flow<ServiceModel?> {
        val service = services.firstOrNull { service -> service.id == id }
        return flowOf(service)
    }

    fun getById(id: Int): ServiceModel? {
        return services.firstOrNull { service -> service.id == id }
    }
}
