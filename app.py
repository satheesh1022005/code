import requests

def analyze_user_interest(user_input):
    try:
        # Use the Bard API to extract keywords and identify patterns in the user's input
        response = requests.post("https://api.bard.ai/v1/analyze", json={"input": user_input}, verify=False)
        response.raise_for_status()  # Raise an error for bad responses (4xx and 5xx)
        
        keywords = response.json()["keywords"]
        patterns = response.json()["patterns"]

        # Identify the user's key interests based on the extracted keywords and patterns
        key_interests = []
        for keyword in keywords:
            if keyword in ["programming", "data science", "machine learning"]:
                key_interests.append("computer science")
            elif keyword in ["history", "literature", "philosophy"]:
                key_interests.append("humanities")
            elif keyword in ["biology", "chemistry", "physics"]:
                key_interests.append("science")

        return key_interests

    except requests.exceptions.RequestException as e:
        print(f"Error: {e}")
        return None

# Rest of your code remains unchanged
