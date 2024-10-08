class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        bool r = false, c = false;
        for(int i = 0; i < matrix.size(); i++) if(matrix[i][0] == 0) {r = true; break;}
        for(int j = 0; j < matrix[0].size(); j++) if(matrix[0][j] == 0) {c = true; break;}
        for(int i = 1; i < matrix.size(); i++){
            for(int j = 1; j < matrix[0].size(); j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.size(); i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < matrix[0].size(); j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 1; j < matrix[0].size(); j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < matrix.size(); i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(r) for(int i = 0; i < matrix.size(); i++) matrix[i][0] = 0;
        if(c) for(int j = 0; j < matrix[0].size(); j++) matrix[0][j] = 0;
    }
};
