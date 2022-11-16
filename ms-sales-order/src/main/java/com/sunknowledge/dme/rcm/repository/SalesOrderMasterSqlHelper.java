package com.sunknowledge.dme.rcm.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.relational.core.sql.Column;
import org.springframework.data.relational.core.sql.Expression;
import org.springframework.data.relational.core.sql.Table;

public class SalesOrderMasterSqlHelper {

    public static List<Expression> getColumns(Table table, String columnPrefix) {
        List<Expression> columns = new ArrayList<>();
//        columns.add(Column.aliased("id", table, columnPrefix + "_id"));
        columns.add(Column.aliased("sales_order_id", table, columnPrefix + "_sales_oder_id"));
        columns.add(Column.aliased("sales_order_no", table, columnPrefix + "_sales_oder_no"));
        columns.add(Column.aliased("patient_id", table, columnPrefix + "_patient_id"));
        columns.add(Column.aliased("patient_first_name", table, columnPrefix + "_patient_first_name"));
        columns.add(Column.aliased("patient_middle_name", table, columnPrefix + "_patient_middle_name"));
        columns.add(Column.aliased("patient_last_name", table, columnPrefix + "_patient_last_name"));
        columns.add(Column.aliased("patient_billing_address_id", table, columnPrefix + "_patient_billing_address_id"));
        columns.add(Column.aliased("patient_address_line_1", table, columnPrefix + "_patient_address_line_1"));
        columns.add(Column.aliased("patient_address_line_2", table, columnPrefix + "_patient_address_line_2"));
        columns.add(Column.aliased("city_name", table, columnPrefix + "_city_name"));
        columns.add(Column.aliased("state_name", table, columnPrefix + "_state_name"));
        columns.add(Column.aliased("zip_code", table, columnPrefix + "_zip_code"));
        columns.add(Column.aliased("patient_contact_id", table, columnPrefix + "_patient_contact_id"));
        columns.add(Column.aliased("patient_contact_no_1", table, columnPrefix + "_phone_1"));
        columns.add(Column.aliased("patient_contact_no_2", table, columnPrefix + "_phone_2"));
        columns.add(Column.aliased("patient_dob", table, columnPrefix + "_patient_dob"));
        columns.add(Column.aliased("patient_height", table, columnPrefix + "_patient_height"));
        columns.add(Column.aliased("patient_weight", table, columnPrefix + "_patient_weight"));
        columns.add(Column.aliased("patient_ssn", table, columnPrefix + "_patient_ssn"));
        columns.add(Column.aliased("patient_gender", table, columnPrefix + "_patient_gender"));
        columns.add(Column.aliased("patient_branch_id", table, columnPrefix + "_patient_branch_id"));
        columns.add(Column.aliased("branch_name", table, columnPrefix + "_branch_name"));
        columns.add(Column.aliased("patient_dod", table, columnPrefix + "_patient_dod"));
        columns.add(Column.aliased("hipaa_on_file_status", table, columnPrefix + "_hipaa_on_file_status"));
        columns.add(Column.aliased("facility_id", table, columnPrefix + "_facility_id"));
        columns.add(Column.aliased("facility_name", table, columnPrefix + "_facility_name"));
        columns.add(Column.aliased("facility_npi", table, columnPrefix + "_facility_npi"));
        columns.add(Column.aliased("delivery_schedule_datetime", table, columnPrefix + "_delivery_schedule_datetime"));
        columns.add(Column.aliased("delivery_actual_datetime", table, columnPrefix + "_delivery_actual_datetime"));
        columns.add(Column.aliased("delivery_address_line_1", table, columnPrefix + "_delivery_address_line_1"));
        columns.add(Column.aliased("delivery_address_line_2", table, columnPrefix + "_delivery_address_line_2"));
        columns.add(Column.aliased("delivery_city_name", table, columnPrefix + "_delivery_city_name"));
        columns.add(Column.aliased("delivery_state_name", table, columnPrefix + "_delivery_state_name"));
        columns.add(Column.aliased("delivery_zip_code", table, columnPrefix + "_delivery_zip_code"));
        columns.add(Column.aliased("delivery_phone_no_1", table, columnPrefix + "_delivery_phone_no_1"));
        columns.add(Column.aliased("delivery_phone_no_2", table, columnPrefix + "_delivery_phone_no_2"));
        columns.add(Column.aliased("delivery_branch_id", table, columnPrefix + "_delivery_branch_id"));
        columns.add(Column.aliased("delivery_branch_name", table, columnPrefix + "_delivery_branch_name"));
        columns.add(Column.aliased("tax_zone_id", table, columnPrefix + "_tax_zone_id"));
        columns.add(Column.aliased("tax_rate", table, columnPrefix + "_tax_rate"));
        columns.add(Column.aliased("sales_order_note", table, columnPrefix + "_sales_order_note"));
        columns.add(Column.aliased("delivery_note", table, columnPrefix + "_delivery_note"));
        columns.add(Column.aliased("delivery_technician", table, columnPrefix + "_delivery_technician"));
        columns.add(Column.aliased("signature_required_status", table, columnPrefix + "_signature_required_status"));
        columns.add(Column.aliased("pod_status", table, columnPrefix + "_pod_status"));
        columns.add(Column.aliased("pod_status_datetime", table, columnPrefix + "_pod_status_datetime"));
        columns.add(Column.aliased("pod_last_message", table, columnPrefix + "_pod_last_message"));
        columns.add(Column.aliased("pod_message_datetime", table, columnPrefix + "_pod_message_datetime"));
        columns.add(Column.aliased("mutual_hold_status", table, columnPrefix + "_mutual_hold_status"));
        columns.add(Column.aliased("hold_reason_id", table, columnPrefix + "_hold_reason_id"));
        columns.add(Column.aliased("hold_status", table, columnPrefix + "_hold_status"));
        columns.add(Column.aliased("hold_reason_description", table, columnPrefix + "_hold_reason_description"));
        columns.add(Column.aliased("stop_date", table, columnPrefix + "_stop_date"));
        columns.add(Column.aliased("stop_reason_id", table, columnPrefix + "_stop_reason_id"));
        columns.add(Column.aliased("stop_reason_description", table, columnPrefix + "_stop_reason_description"));
        columns.add(Column.aliased("inventory_location_id", table, columnPrefix + "_inventory_location_id"));
        columns.add(Column.aliased("order_status", table, columnPrefix + "_order_status"));
        columns.add(Column.aliased("order_classification_id", table, columnPrefix + "_order_classification_id"));
        columns.add(Column.aliased("pos_id", table, columnPrefix + "_pos_id"));
        columns.add(Column.aliased("pos_name", table, columnPrefix + "_pos_name"));
        columns.add(Column.aliased("admission_date", table, columnPrefix + "_admission_date"));
        columns.add(Column.aliased("discharge_date", table, columnPrefix + "_discharge_date"));
        columns.add(Column.aliased("discount_percentage", table, columnPrefix + "_discount_percentage"));
        columns.add(Column.aliased("po_number", table, columnPrefix + "_po_number"));
        columns.add(Column.aliased("user_field_1", table, columnPrefix + "_user_field_1"));
        columns.add(Column.aliased("user_field_2", table, columnPrefix + "_user_field_2"));
        columns.add(Column.aliased("user_field_3", table, columnPrefix + "_user_field_3"));
        columns.add(Column.aliased("user_field_4", table, columnPrefix + "_user_field_4"));
        columns.add(Column.aliased("reference", table, columnPrefix + "_reference"));
        columns.add(Column.aliased("wip_status", table, columnPrefix + "_wip_status"));
        columns.add(Column.aliased("wip_days_in_state", table, columnPrefix + "_wip_days_in_state"));
        columns.add(Column.aliased("wip_assigned_to_id", table, columnPrefix + "_wip_assigned_to_id"));
        columns.add(Column.aliased("wip_date_needed", table, columnPrefix + "_wip_date_needed"));
        columns.add(Column.aliased("completed_status", table, columnPrefix + "_completed_status"));
        columns.add(Column.aliased("status", table, columnPrefix + "_status"));
        columns.add(Column.aliased("created_by_id", table, columnPrefix + "_created_by_id"));
        columns.add(Column.aliased("created_by_name", table, columnPrefix + "_created_by_name"));
        columns.add(Column.aliased("created_date", table, columnPrefix + "_created_date"));
        columns.add(Column.aliased("confirmation_by_id", table, columnPrefix + "_confirmation_by_id"));
        columns.add(Column.aliased("confirmation_by_name", table, columnPrefix + "_confirmation_by_name"));
        columns.add(Column.aliased("confirmation_date", table, columnPrefix + "_confirmation_date"));
        columns.add(Column.aliased("updated_by_id", table, columnPrefix + "_updated_by_id"));
        columns.add(Column.aliased("updated_by_name", table, columnPrefix + "_updated_by_name"));
        columns.add(Column.aliased("updated_date", table, columnPrefix + "_updated_date"));
        columns.add(Column.aliased("sales_order_master_uuid", table, columnPrefix + "_sales_order_master_uuid"));
        columns.add(Column.aliased("so_control_number", table, columnPrefix + "_so_control_number"));
        columns.add(Column.aliased("branch_contact_person_name", table, columnPrefix + "_branch_contact_person_name"));
        columns.add(Column.aliased("branch_npi", table, columnPrefix + "_branch_npi"));
        columns.add(Column.aliased("branch_ein", table, columnPrefix + "_branch_ein"));
        columns.add(Column.aliased("branch_contact_no_1", table, columnPrefix + "_branch_contact_no_1"));
        columns.add(Column.aliased("branch_contact_no_2", table, columnPrefix + "_branch_contact_no_2"));
        columns.add(Column.aliased("additional_patient_identifier", table, columnPrefix + "_additional_patient_identifier"));
        columns.add(Column.aliased("pos_code", table, columnPrefix + "_pos_code"));
        columns.add(Column.aliased("eclaim_carrier_name", table, columnPrefix + "_eclaim_carrier_name"));
        columns.add(Column.aliased("plan_participation_code", table, columnPrefix + "_plan_participation_code"));
        columns.add(Column.aliased("patient_member_id", table, columnPrefix + "_patient_member_id"));
        columns.add(Column.aliased("patient_delivery_address_id", table, columnPrefix + "_patient_delivery_address_id"));

        return columns;
    }
}