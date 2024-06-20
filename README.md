# Healthcare-Appointment-System


Description:
Develop RESTful services for managing appointments in a healthcare system. Users should be able to schedule appointments, view their upcoming appointments, and cancel appointments.

Endpoints:
Initial end points
1. Add Patient information
2. List all patients
3. Get a patient by given id
4. Update Patient details

Later (Next level)
1.	Create Appointment:
	Endpoint: POST /appointments
	Request: Schedule a new appointment by providing details like patient name, doctor, date, and time.
	Response: Return the confirmation of the scheduled appointment.

2.	Get Upcoming Appointments:
	Endpoint: GET /appointments/{doctorId}/upcoming
	Request: Retrieve a list of upcoming appointments for a specific doctor
	Response: Return the details of upcoming appointments in JSON format.

3.	Cancel Appointment:
	Endpoint: DELETE /appointments/{appointmentId}
	Request: Cancel a scheduled appointment by providing its unique identifier.
	Response: Return a success message or confirmation of the canceled appointment.

Notes:
	Response codes should be as per REST guidelines.
	Error handling in case of failures.
	There should not be conflicting appointments, for example – more than one appointment with same doctor on same date & time.
	
