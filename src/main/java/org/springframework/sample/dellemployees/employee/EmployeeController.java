/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.sample.dellemployees.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
class EmployeeController {

   /* private final EmployeeRepository employees;

    public EmployeeController(EmployeeRepository clinicService) {
        this.employees = clinicService;
    }*/

    @GetMapping("/employees")
    public String showEmployeeList(Map<String, Object> model) {
        // Here we are returning an object of type 'Vets' rather than a collection of Vet
        // objects so it is simpler for Object-Xml mapping
       /* Employees employees = new Employees();
        employees.getEmployeeList().addAll(this.employees.findAll());
        model.put("employees", employees);*/
        return "employees/employeeList";
    }

   /* @GetMapping({ "/employee" })
    public @ResponseBody Employees showResourcesEmployeeList() {
        // Here we are returning an object of type 'Employees' rather than a collection of Vet
        // objects so it is simpler for JSon/Object mapping
        Employees employees = new Employees();
        employees.getEmployeeList().addAll(this.employees.findAll());
        return employees;
    }*/

}
