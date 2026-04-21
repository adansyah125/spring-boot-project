package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    @GetMapping("/")
    public String index() {
        
        return """
        <html>
        <head>
            <title>Profil Syahdan</title>
            <style>
                body { 
                    background: #f0f2f5; 
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; 
                    display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0;
                }
                .card {
                    background: white; padding: 30px; border-radius: 15px; 
                    box-shadow: 0 10px 25px rgba(0,0,0,0.1); width: 350px;
                }
                
                h2 { color: #1a73e8; border-bottom: 2px solid #e8f0fe; padding-bottom: 10px; }
                .info { margin: 15px 0; font-size: 14px; color: #555; }
                .info b { color: #333; width: 80px; display: inline-block; }
                button { 
                    background: #1a73e8; color: white; border: none; padding: 10px 20px; 
                    border-radius: 5px; cursor: pointer; width: 100%; font-weight: bold; margin-top: 10px;
                }
                button:hover { background: #1557b0; }
                #secret-hobi { display: none; margin-top: 10px; padding: 10px; background: #e8f0fe; border-radius: 5px; }
            </style>
        </head>
        <body>
            <div class="card">
                <h2 style="text-align: center;"> Profil Mahasiswa</h2>
                <div class="info"><b>NIM</b> : 23110065</div>
                <div class="info"><b>Nama</b> : Syahdan Mutahariq</div>
                <div class="info"><b>Kelas</b> : J 2023</div>
                <div class="info"><b>Alamat</b> : Kopo Bandung</div>
                <div class="info"><b>No. HP</b> : 089677121092</div>
                
                <hr style="border: 0.5px solid #eee">
                
                <button onclick="toggleHobi()">Lihat Cita-cita & Hobi</button>
                
                <div id="secret-hobi">
                    <p> <b>Cita-cita:</b> Senior Software Engineer</p>
                    <p> <b>Hobi:</b> 404 Not Found</p>
                </div>
            </div>

            <script>
                function toggleHobi() {
                    var x = document.getElementById("secret-hobi");
                    if (x.style.display === "none" || x.style.display === "") {
                        x.style.display = "block";
                    } else {
                        x.style.display = "none";
                    }
                }
            </script>
        </body>
        </html>
        """;
    }

    
    @GetMapping("/api/profile")
    public Map<String, Object> getProfile(){
        Map<String, Object> data = new LinkedHashMap<>();
        
        data.put("status", "success");
        data.put("nim", "210001234");
        data.put("nama", "Syahdan");
        data.put("kelas", "Informatika A");
        data.put("alamat", "Bandung, Indonesia");
        data.put("no_hp", "08123456789");
        data.put("cita_cita", "Senior Software Engineer");
        data.put("hobi", "404 Not Found");
        
        return data;
    }
    
}