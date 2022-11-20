import { toast } from "react-toastify"
import icon from "../../assets/img/notification-icon.svg"
import "./styles.css"

function handleClick(){
    return(
        toast.info("SMS enviado com sucesso")
    )
}

function NotificationButton() {
    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick()}>
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton
