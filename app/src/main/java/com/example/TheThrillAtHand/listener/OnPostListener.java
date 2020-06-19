// 작성자 : 2016039002 박성진
// 설  명 : PostInfo class listener

package com.example.TheThrillAtHand.listener;

import com.example.TheThrillAtHand.PostInfo;

public interface OnPostListener {
    void onDelete(PostInfo postInfo);
    void onModify();
}
