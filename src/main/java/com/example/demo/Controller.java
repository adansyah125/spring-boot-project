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
            <title>Profil Sukses - Syahdan</title>
            <style>
                * { box-sizing: border-box; }
                body { 
                    background: linear-gradient(135deg, #e0eafc 0%, #cfdef3 100%);
                    font-family: 'Inter', 'Segoe UI', Roboto, sans-serif; 
                    display: flex; justify-content: center; align-items: center; 
                    min-height: 100vh; margin: 0; 
                }
                .card {
                    background: white; padding: 40px; border-radius: 20px; 
                    box-shadow: 0 15px 35px rgba(0,0,0,0.1); 
                    width: 420px; text-align: center;
                }
                .success-header {
                    color: #1e8e3e; background: #e6f4ea; padding: 15px;
                    border-radius: 12px; margin-bottom: 25px; font-weight: bold;
                    font-size: 16px; border: 1px solid #ceead6;
                }
                .avatar {
                    width: 70px; height: 70px; background: #1a73e8; color: white;
                    border-radius: 50%; display: flex; justify-content: center; align-items: center;
                    font-size: 28px; font-weight: bold; margin: 0 auto 15px;
                }
                h2 { color: #202124; margin: 0 0 20px 0; font-size: 20px; }
                
                .info-container { text-align: left; margin-bottom: 25px; background: #f8f9fa; padding: 20px; border-radius: 12px; }
                .info-row { 
                    display: grid; grid-template-columns: 80px 10px 1fr; 
                    margin-bottom: 10px; font-size: 14px; color: #5f6368;
                }
                .info-row b { color: #202124; }
                
                button { 
                    background: #1a73e8; color: white; border: none; padding: 12px; 
                    border-radius: 8px; cursor: pointer; width: 100%; font-weight: 600;
                    transition: all 0.2s;
                }
                button:hover { background: #1557b0; transform: translateY(-1px); }
                
                #extra-info { 
                    display: none; margin-top: 20px; text-align: left;
                    padding-top: 15px; border-top: 1px solid #eee;
                    animation: fadeIn 0.3s ease;
                }
                @keyframes fadeIn { from { opacity: 0; } to { opacity: 1; } }
            </style>
        </head>
        <body>
            <div class="card">
                <div class="success-header">
                     Selamat! Web Sederhana Spring Boot Berhasil Berjalan
                </div>
                
                <div class="avatar">SM</div>
                <h2>Biodata Mahasiswa</h2>
                
                <div class="info-container">
                    <div class="info-row"><b>NIM</b><span>:</span>23110065</div>
                    <div class="info-row"><b>Nama</b><span>:</span>Syahdan Mutahariq</div>
                    <div class="info-row"><b>Kelas</b><span>:</span>J 2023</div>
                    <div class="info-row"><b>Alamat</b><span>:</span>Kopo, Bandung</div>
                    <div class="info-row"><b>No. HP</b><span>:</span>089677121092</div>
                </div>
                
                <button onclick="toggleInfo()">Lihat Detail Lainnya</button>
                
                <div id="extra-info">
                    <div style="margin-bottom: 8px;"> <b>Cita-cita:</b> Senior Software Engineer</div>
                    <div> <b>Hobi:</b> 404 Not Found</div>
                </div>
            </div>

            <script>
                function toggleInfo() {
                    const x = document.getElementById("extra-info");
                    const btn = document.querySelector("button");
                    if (x.style.display === "none" || x.style.display === "") {
                        x.style.display = "block";
                        btn.innerText = "Sembunyikan Detail";
                    } else {
                        x.style.display = "none";
                        btn.innerText = "Lihat Detail Lainnya";
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