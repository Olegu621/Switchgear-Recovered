.class public final Lvn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lvn;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn;->d:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, Lvn;->c:Ljava/lang/Object;

    .line 16
    iput-boolean p3, p0, Lvn;->b:Z

    return-void
.end method

.method public constructor <init>(Lcom/supercell/titan/GameApp;ZLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lvn;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvn;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lvn;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, Lvn;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lwn;Ly92;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lvn;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn;->d:Ljava/lang/Object;

    .line 18
    iput-boolean v0, p0, Lvn;->b:Z

    .line 19
    iput-object p2, p0, Lvn;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lvn;->a:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    iget-object v2, p0, Lvn;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, Lvn;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/supercell/titan/VirtualKeyboardHandler;->c:Lcom/supercell/titan/KeyboardDialog;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v0, Lcom/supercell/titan/VirtualKeyboardHandler;->c:Lcom/supercell/titan/KeyboardDialog;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Lcom/supercell/titan/KeyboardDialog;

    .line 28
    .line 29
    check-cast v3, Lcom/supercell/titan/GameApp;

    .line 30
    .line 31
    invoke-direct {v0, v3}, Lcom/supercell/titan/KeyboardDialog;-><init>(Lcom/supercell/titan/GameApp;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/supercell/titan/VirtualKeyboardHandler;->c:Lcom/supercell/titan/KeyboardDialog;

    .line 35
    .line 36
    :goto_0
    sget-object v0, Lcom/supercell/titan/VirtualKeyboardHandler;->c:Lcom/supercell/titan/KeyboardDialog;

    .line 37
    .line 38
    iget-boolean p0, p0, Lvn;->b:Z

    .line 39
    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, v0, Lcom/supercell/titan/KeyboardDialog;->a:Lcom/supercell/titan/GameApp;

    .line 43
    .line 44
    iget-object v4, v0, Lcom/supercell/titan/KeyboardDialog;->b:Landroid/widget/Button;

    .line 45
    .line 46
    iget-object v5, v0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/supercell/titan/KeyboardDialog;->updateUIFlags()V

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    const/16 v7, 0x10

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    const/4 v9, 0x2

    .line 56
    const/16 v10, 0xc

    .line 57
    .line 58
    const/4 v11, -0x2

    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    sget p0, Lcom/supercell/titan/R$drawable;->edit_text_style:I

    .line 62
    .line 63
    invoke-virtual {v5, p0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 64
    .line 65
    .line 66
    sget p0, Lcom/supercell/titan/R$style;->largeEdittextText:I

    .line 67
    .line 68
    invoke-virtual {v5, v3, p0}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 69
    .line 70
    .line 71
    iget p0, v0, Lcom/supercell/titan/KeyboardDialog;->f:I

    .line 72
    .line 73
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setWidth(I)V

    .line 74
    .line 75
    .line 76
    iget-object p0, v0, Lcom/supercell/titan/KeyboardDialog;->e:Landroid/graphics/Typeface;

    .line 77
    .line 78
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 79
    .line 80
    .line 81
    const/16 p0, 0x8

    .line 82
    .line 83
    invoke-static {p0}, Lcom/supercell/titan/KeyboardDialog;->a(I)I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    const/4 v12, 0x6

    .line 88
    invoke-static {v12}, Lcom/supercell/titan/KeyboardDialog;->a(I)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    invoke-virtual {v5, p0, v12, p0, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 93
    .line 94
    .line 95
    if-eqz v2, :cond_1

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-lez p0, :cond_1

    .line 106
    .line 107
    new-instance p0, Ldp0;

    .line 108
    .line 109
    invoke-direct {p0, v0, v2, v7, v6}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, p0}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    :cond_1
    const/16 p0, 0xe

    .line 116
    .line 117
    invoke-static {p0}, Lcom/supercell/titan/KeyboardDialog;->a(I)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    sget v2, Lcom/supercell/titan/R$drawable;->edit_text_style:I

    .line 122
    .line 123
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 124
    .line 125
    .line 126
    const-string v2, "\u2714"

    .line 127
    .line 128
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, p0, v6, p0, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 132
    .line 133
    .line 134
    invoke-static {v9}, Lcom/supercell/titan/KeyboardDialog;->a(I)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 139
    .line 140
    invoke-direct {v2, v11, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, p0, v6, v6, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 144
    .line 145
    .line 146
    new-instance p0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 147
    .line 148
    const/4 v12, -0x1

    .line 149
    invoke-direct {p0, v12, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 156
    .line 157
    .line 158
    const/16 v10, 0x15

    .line 159
    .line 160
    invoke-virtual {v2, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    invoke-virtual {p0, v7, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setHeight(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_2
    const/4 p0, 0x0

    .line 185
    invoke-virtual {v4, p0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 186
    .line 187
    .line 188
    const-string v2, ""

    .line 189
    .line 190
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setHeight(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, p0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 197
    .line 198
    .line 199
    sget p0, Lcom/supercell/titan/R$style;->invisibleText:I

    .line 200
    .line 201
    invoke-virtual {v5, v3, p0}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setWidth(I)V

    .line 205
    .line 206
    .line 207
    new-instance p0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 208
    .line 209
    invoke-direct {p0, v11, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 216
    .line 217
    .line 218
    :goto_1
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-virtual {p0, v7}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-virtual {p0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z

    .line 236
    .line 237
    .line 238
    const-string p0, "input_method"

    .line 239
    .line 240
    invoke-virtual {v3, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 245
    .line 246
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 247
    .line 248
    const/16 v2, 0x21

    .line 249
    .line 250
    if-lt v1, v2, :cond_3

    .line 251
    .line 252
    invoke-virtual {p0, v5, v6}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_3
    iget-object v0, v0, Lcom/supercell/titan/KeyboardDialog;->c:Le41;

    .line 257
    .line 258
    invoke-virtual {p0, v0, v6}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-nez v0, :cond_4

    .line 263
    .line 264
    invoke-virtual {p0, v5, v9}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-nez v0, :cond_4

    .line 269
    .line 270
    invoke-virtual {p0, v6, v8}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 271
    .line 272
    .line 273
    :cond_4
    :goto_2
    sput-boolean v8, Lcom/supercell/titan/VirtualKeyboardHandler;->visible:Z

    .line 274
    .line 275
    return-void

    .line 276
    :pswitch_0
    check-cast v3, Landroid/view/View;

    .line 277
    .line 278
    check-cast v2, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 279
    .line 280
    iget-object v0, v2, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:Lj33;

    .line 281
    .line 282
    if-eqz v0, :cond_5

    .line 283
    .line 284
    invoke-virtual {v0}, Lj33;->h()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_5

    .line 289
    .line 290
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 291
    .line 292
    invoke-virtual {v3, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_5
    iget-boolean p0, p0, Lvn;->b:Z

    .line 297
    .line 298
    if-eqz p0, :cond_6

    .line 299
    .line 300
    iget-object p0, v2, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Lfs0;

    .line 301
    .line 302
    if-eqz p0, :cond_6

    .line 303
    .line 304
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast p0, Lcom/supercell/titan/k;

    .line 307
    .line 308
    iget-object p0, p0, Lcom/supercell/titan/k;->b:Lcom/supercell/titan/ScInfoBox;

    .line 309
    .line 310
    invoke-virtual {p0}, Lcom/supercell/titan/ScInfoBox;->dismiss()V

    .line 311
    .line 312
    .line 313
    :cond_6
    :goto_3
    return-void

    .line 314
    :pswitch_1
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 315
    .line 316
    new-instance v0, Ls2;

    .line 317
    .line 318
    invoke-direct {v0, p0, v1}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 319
    .line 320
    .line 321
    invoke-interface {v3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
