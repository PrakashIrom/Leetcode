class Solution {
    int top=-1;
	char c[];
    public boolean isValid(String s) {
		c=new char[s.length()];
		int i=0;
		for(i=0;i<s.length();i++) {
			char br=s.charAt(i);
			if (br == '(' || br == '[' || br == '{') {
				push(br);
			}
			else if(br==')' || br=='}' || br==']') {
				if(top==-1)
				{
					return false;
				}
				else {
					if(br==')' && c[top]=='(')
						pop();
					else if(br=='}' && c[top]=='{')
						pop();
					else if(br==']' && c[top]=='[')
						pop();
					else {
					return false;
					}
				}
			}
		}
		if(top==-1 && i==s.length())
			return true;
		return false;
	}
    
    void push(char cha) {
		c[++top]=cha;
	}
	void pop() {
		--top;
	}
}
    

