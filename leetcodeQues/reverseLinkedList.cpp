class Solution {
public:
    // ListNode* reverseList(ListNode* head) {
    //     if(head == NULL) return NULL;
    //     ListNode *temp = reverseList(head->next);
    //     if(temp == NULL) return head;
    //     else{
    //         ListNode* temp2 = temp;
    //         while(temp2->next != NULL){
    //             temp2 = temp2->next;
    //         }
    //         temp2->next = head;
    //         head->next = NULL;
    //     }
    //     return temp;
    // }

    ListNode* reverseList(ListNode* head) {
        ListNode *temp = NULL;
        while(head != NULL){
            ListNode *temp2 = head->next;
            head->next = temp;
            temp = head;
            head = temp2;
        }
        return temp;
    }
};
