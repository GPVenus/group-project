# 📡 Java Socket-Based Routing Simulation: Node A ↔ Node B

This project simulates a basic routing information exchange between **two nodes (Node A and Node B)** using Java sockets and object serialization. It mimics a simplified version of the **RIP (Routing Information Protocol)** logic, demonstrating how routing tables (represented as `GraphicalObject` lists) are shared and acknowledged.

---

## 📁 Project Structure
---

## 🧠 How It Works

### ➤ Node A (`NodeA.java`)
- Starts a server on port `8000`
- Accepts a connection from Node B
- Receives a list of `GraphicalObject`s
- Prints the received routing table
- Sends back an `Acknowledgement` object confirming receipt

### ➤ Node B (`NodeB.java`)
- Connects to Node A on `localhost:8000`
- Initializes and sends a list of `GraphicalObject`s
- Waits for an `Acknowledgement` object
- Prints the acknowledgment message from Node A

---

## 🔁 Interaction Flow

### Figure 1: Communication Sequence

---

### Figure 2: Sample Routing Tables (GraphicalObject List)

| Object Type | Width | Height | Color |
|-------------|--------|--------|--------|
| Rectangle   | 10     | 5      | Red    |
| Square      | 10     | 10     | Green  |

> 🧾 Sent from Node B → Node A

---

## 🔧 How to Run

1. **Compile all Java files:**
   ```bash
   javac *.java

java NodeA

java NodeB



📚 References
	1.	Turkkan, B., Rodrigues, E., Kosar, T., Charapko, A., Ailijiang, A., & Demirbas, M. (2023). How to evaluate distributed coordination systems? – A survey and analysis. arXiv:2302.12847. https://doi.org/10.48550/arXiv.2302.12847
	2.	Xia, Y., Du, D., Hua, Z., Zang, B., Chen, H., & Guan, H. (2023). Boosting inter-process communication with architectural support. ASPLOS ’23. https://doi.org/10.1145/3575693.3575723
	3.	Seemakhupt, K., et al. (2023). A cloud-scale characterization of remote procedure calls. SoCC ’23. https://doi.org/10.1145/3600006
	4.	Mello, S. L. V., & Duarte Jr., E. P. (2022). A hybrid peer-to-peer and client server strategy for multimedia streaming. Retrieved from https://www.researchgate.net/publication/359202633
	5.	Talaver, O. V., & Vakaliuk, T. A. (2023). Reliable distributed systems: Review of modern approaches. Journal of Edge Computing. https://doi.org/10.55056/jec.586

 <img width="500" height="94" alt="image" src="https://github.com/user-attachments/assets/beb02e48-a925-4a2f-88bb-79260c43ef26" />


.
