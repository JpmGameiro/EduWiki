package isel.leic.ps.eduWikiAPI.domain.outputModel.collections.staging

import isel.leic.ps.eduWikiAPI.domain.outputModel.single.staging.WorkAssignmentStageOutputModel

data class WorkAssignmentStageCollectionOutputModel (
        val workAssignmentStageList: List<WorkAssignmentStageOutputModel>
)