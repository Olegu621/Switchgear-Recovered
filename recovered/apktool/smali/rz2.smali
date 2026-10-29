.class public final Lrz2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lew2;

.field public final b:Loh;

.field public final c:Lts0;

.field public final d:Lwu1;

.field public final e:Ljava/lang/ref/WeakReference;

.field public final f:Lhk2;

.field public g:Lac1;

.field public h:Lo7;

.field public i:Lys2;

.field public j:Lbt2;

.field public final k:Lhk2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lew2;Loh;Ljava/lang/Integer;ZLts0;Lwu1;)V
    .locals 6

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lrz2;->a:Lew2;

    .line 8
    .line 9
    iput-object p3, p0, Lrz2;->b:Loh;

    .line 10
    .line 11
    iput-object p6, p0, Lrz2;->c:Lts0;

    .line 12
    .line 13
    iput-object p7, p0, Lrz2;->d:Lwu1;

    .line 14
    .line 15
    new-instance p3, Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-direct {p3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object p3, p0, Lrz2;->e:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    invoke-virtual {p0}, Lrz2;->c()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    instance-of p3, p1, Landroid/app/Activity;

    .line 27
    .line 28
    const/4 p6, 0x0

    .line 29
    if-eqz p3, :cond_0

    .line 30
    .line 31
    check-cast p1, Landroid/app/Activity;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object p1, p6

    .line 35
    :goto_0
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/Window;->getStatusBarColor()I

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p0}, Lrz2;->c()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    new-instance p6, Lz00;

    .line 53
    .line 54
    sget p3, Lcom/usercentrics/sdk/ui/R$style;->BaseTheme:I

    .line 55
    .line 56
    invoke-direct {p6, p1, p3}, Lz00;-><init>(Landroid/content/Context;I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    new-instance p1, Lqz2;

    .line 60
    .line 61
    const/4 p3, 0x1

    .line 62
    invoke-direct {p1, p0, p3}, Lqz2;-><init>(Lrz2;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lrz2;->f:Lhk2;

    .line 70
    .line 71
    invoke-virtual {p0}, Lrz2;->c()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_7

    .line 76
    .line 77
    new-instance p1, Lac1;

    .line 78
    .line 79
    invoke-direct {p1}, Lac1;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lrz2;->g:Lac1;

    .line 83
    .line 84
    new-instance v4, Lys2;

    .line 85
    .line 86
    if-nez p6, :cond_3

    .line 87
    .line 88
    new-instance p1, Lz00;

    .line 89
    .line 90
    sget p3, Lcom/usercentrics/sdk/ui/R$style;->BaseTheme:I

    .line 91
    .line 92
    invoke-direct {p1, v1, p3}, Lz00;-><init>(Landroid/content/Context;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    move-object p1, p6

    .line 97
    :goto_1
    const/4 p3, 0x0

    .line 98
    invoke-direct {v4, v1, p2, p1, p3}, Lys2;-><init>(Landroid/content/Context;Lew2;Lz00;Z)V

    .line 99
    .line 100
    .line 101
    sget p1, Lcom/usercentrics/sdk/ui/R$id;->ucBannerContainer:I

    .line 102
    .line 103
    invoke-virtual {v4, p1}, Landroid/view/View;->setId(I)V

    .line 104
    .line 105
    .line 106
    const/4 p1, 0x4

    .line 107
    invoke-virtual {v4, p1}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Lbt2;

    .line 111
    .line 112
    move-object v2, p2

    .line 113
    move-object v3, p4

    .line 114
    move v5, p5

    .line 115
    invoke-direct/range {v0 .. v5}, Lbt2;-><init>(Landroid/content/Context;Lew2;Ljava/lang/Integer;Lys2;Z)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Lrz2;->j:Lbt2;

    .line 119
    .line 120
    iput-object v4, p0, Lrz2;->i:Lys2;

    .line 121
    .line 122
    if-nez p6, :cond_4

    .line 123
    .line 124
    new-instance p6, Lz00;

    .line 125
    .line 126
    sget p1, Lcom/usercentrics/sdk/ui/R$style;->BaseTheme:I

    .line 127
    .line 128
    invoke-direct {p6, v1, p1}, Lz00;-><init>(Landroid/content/Context;I)V

    .line 129
    .line 130
    .line 131
    :cond_4
    iget-object p1, p0, Lrz2;->j:Lbt2;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object p1, p1, Lbt2;->g:Lhk2;

    .line 137
    .line 138
    invoke-virtual {p1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Landroid/view/View;

    .line 143
    .line 144
    new-instance p2, Lqz2;

    .line 145
    .line 146
    invoke-direct {p2, p0, p3}, Lqz2;-><init>(Lrz2;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget p4, Lcom/usercentrics/sdk/ui/R$style;->UsercentricsBanner:I

    .line 153
    .line 154
    new-instance p5, Ln7;

    .line 155
    .line 156
    invoke-direct {p5, p6, p4}, Ln7;-><init>(Landroid/content/Context;I)V

    .line 157
    .line 158
    .line 159
    iget-object p4, p5, Ln7;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p4, Lj7;

    .line 162
    .line 163
    iput-boolean p3, p4, Lj7;->k:Z

    .line 164
    .line 165
    new-instance p6, Lvt1;

    .line 166
    .line 167
    invoke-direct {p6, p2}, Lvt1;-><init>(Lqz2;)V

    .line 168
    .line 169
    .line 170
    iput-object p6, p4, Lj7;->m:Lvt1;

    .line 171
    .line 172
    iput-object p1, p4, Lj7;->q:Landroid/view/View;

    .line 173
    .line 174
    invoke-virtual {p5}, Ln7;->b()Lo7;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    new-instance p4, Lwt1;

    .line 179
    .line 180
    invoke-direct {p4, p2, p3}, Lwt1;-><init>(Lo7;Z)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2, p4}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Landroid/app/Dialog;->show()V

    .line 187
    .line 188
    .line 189
    invoke-static {p1}, Lhe3;->p(Landroid/view/View;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-eqz p1, :cond_5

    .line 197
    .line 198
    const/4 p4, -0x1

    .line 199
    invoke-virtual {p1, p4, p4}, Landroid/view/Window;->setLayout(II)V

    .line 200
    .line 201
    .line 202
    new-instance p4, Landroid/graphics/drawable/ColorDrawable;

    .line 203
    .line 204
    invoke-direct {p4, p3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, p4}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 208
    .line 209
    .line 210
    const/4 p4, 0x0

    .line 211
    invoke-virtual {p1, p4}, Landroid/view/Window;->setDimAmount(F)V

    .line 212
    .line 213
    .line 214
    :cond_5
    iput-object p2, p0, Lrz2;->h:Lo7;

    .line 215
    .line 216
    iget-object p1, p0, Lrz2;->j:Lbt2;

    .line 217
    .line 218
    if-eqz p1, :cond_7

    .line 219
    .line 220
    iget-boolean p2, p1, Lbt2;->e:Z

    .line 221
    .line 222
    if-eqz p2, :cond_6

    .line 223
    .line 224
    new-instance p2, Landroid/os/Handler;

    .line 225
    .line 226
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 231
    .line 232
    .line 233
    new-instance p3, Lf72;

    .line 234
    .line 235
    const/16 p4, 0x8

    .line 236
    .line 237
    invoke-direct {p3, p1, p4}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    invoke-virtual {p1}, Lbt2;->a()Landroid/widget/FrameLayout;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 249
    .line 250
    .line 251
    iget-object p1, p1, Lbt2;->d:Lys2;

    .line 252
    .line 253
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 254
    .line 255
    .line 256
    :cond_7
    :goto_2
    new-instance p1, Lyh;

    .line 257
    .line 258
    const/16 p2, 0x1a

    .line 259
    .line 260
    invoke-direct {p1, p0, p2}, Lyh;-><init>(Ljava/lang/Object;I)V

    .line 261
    .line 262
    .line 263
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iput-object p1, p0, Lrz2;->k:Lhk2;

    .line 268
    .line 269
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lrz2;->g:Lac1;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v1, v0, Lac1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    iget-object v2, v0, Lac1;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lac1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lyv1;

    .line 59
    .line 60
    invoke-virtual {v4}, Lyv1;->dispose()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Ljava/util/Map;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Lyv1;

    .line 103
    .line 104
    invoke-virtual {v4}, Lyv1;->dispose()V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 112
    .line 113
    .line 114
    :cond_4
    const/4 v0, 0x0

    .line 115
    iput-object v0, p0, Lrz2;->g:Lac1;

    .line 116
    .line 117
    iput-object v0, p0, Lrz2;->h:Lo7;

    .line 118
    .line 119
    iput-object v0, p0, Lrz2;->i:Lys2;

    .line 120
    .line 121
    iput-object v0, p0, Lrz2;->j:Lbt2;

    .line 122
    .line 123
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lrz2;->c()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lmn0;->u(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lrz2;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lrz2;->h:Lo7;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lrz2;->h:Lo7;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lo7;->dismiss()V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, Lrz2;->a()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final c()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lrz2;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/Context;

    .line 8
    .line 9
    return-object p0
.end method
