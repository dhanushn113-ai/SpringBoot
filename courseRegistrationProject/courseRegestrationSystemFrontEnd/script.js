function showCourses() {

    fetch("http://localhost:8080/course")
        .then((response) => response.json())
        .then((courses) => {

            const datatable = document.getElementById("coursetable");

            courses.forEach(course => {

                const row = `
                    <tr>
                        <td>${course.course_id}</td>
                        <td>${course.course_name}</td>
                        <td>${course.trainer}</td>
                        <td>${course.durationInWeek}</td>
                    </tr>
                `;

                datatable.innerHTML += row;
            });
        })
        .catch(error => console.error(error));
}

function showEnrollStudents() {
     fetch("http://localhost:8080/course/enrolled")
        .then((response) => response.json())
        .then((students) => {

            const datatable = document.getElementById("coursetable");

            students.forEach(student => {

                const row = `
                    <tr>
                        <td>${student.candidate_name}</td>
                        <td>${student.email_id}</td>
                        <td>${student.courseName}</td>
                       
                    </tr>
                `;

                datatable.innerHTML += row;
            });
        })
        .catch(error => console.error(error));

}