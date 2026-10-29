.class public final Lu1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget v0, p0, Lu1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, Lu1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->A0:Landroidx/appcompat/widget/k;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v2, p0, Landroidx/appcompat/widget/k;->b:Lsg1;

    .line 19
    .line 20
    :goto_0
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Lsg1;->collapseActionView()Z

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void

    .line 26
    :pswitch_0
    check-cast p0, Lcom/supercell/titan/k;

    .line 27
    .line 28
    iget-object p0, p0, Lcom/supercell/titan/k;->b:Lcom/supercell/titan/ScInfoBox;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/supercell/titan/ScInfoBox;->d:Landroid/view/View$OnClickListener;

    .line 31
    .line 32
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/supercell/titan/ScInfoBox;->dismiss()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    check-cast p0, Lor1;

    .line 40
    .line 41
    iget-object p1, p0, Lde0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {p0}, Lor1;->d(Lor1;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    if-ltz v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 74
    .line 75
    .line 76
    :cond_4
    iget-object p0, p1, Lcom/google/android/material/textfield/TextInputLayout;->P0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 77
    .line 78
    iget-object v0, p1, Lcom/google/android/material/textfield/TextInputLayout;->R0:Landroid/content/res/ColorStateList;

    .line 79
    .line 80
    invoke-static {p1, p0, v0}, Lw11;->D(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 81
    .line 82
    .line 83
    :goto_2
    return-void

    .line 84
    :pswitch_2
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 85
    .line 86
    check-cast p0, Lgm1;

    .line 87
    .line 88
    iget-object v0, p0, Lgm1;->e:Lyl1;

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    iput-boolean v3, v0, Lyl1;->f:Z

    .line 93
    .line 94
    :cond_5
    invoke-virtual {p1}, Lcom/google/android/material/internal/NavigationMenuItemView;->getItemData()Lsg1;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object v0, p0, Lgm1;->c:Ljg1;

    .line 99
    .line 100
    invoke-virtual {v0, p1, p0, v1}, Ljg1;->q(Landroid/view/MenuItem;Leh1;I)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    invoke-virtual {p1}, Lsg1;->isCheckable()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    iget-object v0, p0, Lgm1;->e:Lyl1;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Lyl1;->i(Lsg1;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    move v3, v1

    .line 121
    :goto_3
    iget-object p1, p0, Lgm1;->e:Lyl1;

    .line 122
    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    iput-boolean v1, p1, Lyl1;->f:Z

    .line 126
    .line 127
    :cond_7
    if-eqz v3, :cond_8

    .line 128
    .line 129
    invoke-virtual {p0, v1}, Lgm1;->b(Z)V

    .line 130
    .line 131
    .line 132
    :cond_8
    return-void

    .line 133
    :pswitch_3
    check-cast p1, Lrl1;

    .line 134
    .line 135
    invoke-virtual {p1}, Lrl1;->getItemData()Lsg1;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p0, Ltl1;

    .line 140
    .line 141
    iget-object v0, p0, Ltl1;->p0:Ljg1;

    .line 142
    .line 143
    iget-object p0, p0, Ltl1;->o0:Lcom/google/android/material/navigation/b;

    .line 144
    .line 145
    invoke-virtual {v0, p1, p0, v1}, Ljg1;->q(Landroid/view/MenuItem;Leh1;I)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_9

    .line 150
    .line 151
    invoke-virtual {p1, v3}, Lsg1;->setChecked(Z)Landroid/view/MenuItem;

    .line 152
    .line 153
    .line 154
    :cond_9
    return-void

    .line 155
    :pswitch_4
    check-cast p0, Lcom/google/android/material/datepicker/l;

    .line 156
    .line 157
    iget p1, p0, Lcom/google/android/material/datepicker/l;->f:I

    .line 158
    .line 159
    const/4 v0, 0x2

    .line 160
    if-ne p1, v0, :cond_a

    .line 161
    .line 162
    invoke-virtual {p0, v3}, Lcom/google/android/material/datepicker/l;->i(I)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_a
    if-ne p1, v3, :cond_b

    .line 167
    .line 168
    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/l;->i(I)V

    .line 169
    .line 170
    .line 171
    :cond_b
    :goto_4
    return-void

    .line 172
    :pswitch_5
    check-cast p0, Lcom/supercell/titan/KeyboardDialog;

    .line 173
    .line 174
    iget-object p0, p0, Lcom/supercell/titan/KeyboardDialog;->a:Lcom/supercell/titan/GameApp;

    .line 175
    .line 176
    new-instance p1, Lvc0;

    .line 177
    .line 178
    const/4 v0, 0x4

    .line 179
    invoke-direct {p1, v0}, Lvc0;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p1}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_6
    check-cast p0, Lza0;

    .line 187
    .line 188
    iget-object p1, p0, Lde0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 189
    .line 190
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Landroid/widget/AutoCompleteTextView;

    .line 195
    .line 196
    invoke-static {p0, p1}, Lza0;->d(Lza0;Landroid/widget/AutoCompleteTextView;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_7
    check-cast p0, Lqv;

    .line 201
    .line 202
    iget-object p0, p0, Lde0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 203
    .line 204
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-eqz p1, :cond_c

    .line 213
    .line 214
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 215
    .line 216
    .line 217
    :cond_c
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->P0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 218
    .line 219
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R0:Landroid/content/res/ColorStateList;

    .line 220
    .line 221
    invoke-static {p0, p1, v0}, Lw11;->D(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :pswitch_8
    check-cast p0, Lm7;

    .line 226
    .line 227
    iget-object v0, p0, Lm7;->i:Landroid/widget/Button;

    .line 228
    .line 229
    if-ne p1, v0, :cond_d

    .line 230
    .line 231
    iget-object v0, p0, Lm7;->k:Landroid/os/Message;

    .line 232
    .line 233
    if-eqz v0, :cond_d

    .line 234
    .line 235
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    goto :goto_5

    .line 240
    :cond_d
    iget-object v0, p0, Lm7;->l:Landroid/widget/Button;

    .line 241
    .line 242
    if-ne p1, v0, :cond_e

    .line 243
    .line 244
    iget-object v0, p0, Lm7;->n:Landroid/os/Message;

    .line 245
    .line 246
    if-eqz v0, :cond_e

    .line 247
    .line 248
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    goto :goto_5

    .line 253
    :cond_e
    iget-object v0, p0, Lm7;->o:Landroid/widget/Button;

    .line 254
    .line 255
    if-ne p1, v0, :cond_f

    .line 256
    .line 257
    iget-object p1, p0, Lm7;->q:Landroid/os/Message;

    .line 258
    .line 259
    if-eqz p1, :cond_f

    .line 260
    .line 261
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    :cond_f
    :goto_5
    if-eqz v2, :cond_10

    .line 266
    .line 267
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 268
    .line 269
    .line 270
    :cond_10
    iget-object p1, p0, Lm7;->E:Lk7;

    .line 271
    .line 272
    iget-object p0, p0, Lm7;->b:Lo7;

    .line 273
    .line 274
    invoke-virtual {p1, v3, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :pswitch_9
    check-cast p0, Lj2;

    .line 283
    .line 284
    invoke-virtual {p0}, Lj2;->a()V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
