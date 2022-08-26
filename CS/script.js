const userMessages = [];

const userMessageForm = document.querySelector("form");
const userMessageList = document.querySelector("ul");
var messageItems = "";

function renderMessages(){
    console.log(userMessages)
    
    for(let message of userMessages){
        console.log(message.image)
        console.log(message.text)
        messageItems = `
            <li>
                <div>
                    <img width="100px" height="50px" src="${message.image}" alt="${message.text}" />
                </div>
                <p>${message.text}</p>
            </li>
        `;
    }

    userMessageList.innerHTML = messageItems;
}

function formSubmitHandler(e){
    e.preventDefault();

    const userMessageInput = e.target.querySelector('textarea');
    const messageImageInput = e.target.querySelector('input');

    const userMessage = userMessageInput.value;
    const imageUrl = messageImageInput.value;

    userMessages.push({
        text: userMessage,
        image: imageUrl
    })

    userMessageInput.value = '';
    messageImageInput.value = '';

    if(! userMessage || !imageUrl || userMessage.trim().length === 0 || imageUrl.trim().length === 0){
        alert("send or insert valid message and image")
        return;
    }

    renderMessages();
}

userMessageForm.addEventListener("submit", formSubmitHandler);