.class public final Landroidx/fragment/app/d;
.super Landroidx/fragment/app/f;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final b:Z

.field public c:Z

.field public d:Lwc0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c0;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/fragment/app/f;-><init>(Landroidx/fragment/app/c0;)V

    .line 5
    .line 6
    .line 7
    iput-boolean p2, p0, Landroidx/fragment/app/d;->b:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Lwc0;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/fragment/app/d;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/fragment/app/d;->d:Lwc0;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    iget v0, v0, Landroidx/fragment/app/c0;->a:I

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    move v0, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v3

    .line 25
    :goto_0
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getNextTransition()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-boolean v5, p0, Landroidx/fragment/app/d;->b:Z

    .line 30
    .line 31
    if-eqz v5, :cond_3

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getPopEnterAnim()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getPopExitAnim()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getEnterAnim()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    goto :goto_1

    .line 52
    :cond_4
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getExitAnim()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    :goto_1
    invoke-virtual {v1, v3, v3, v3, v3}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 57
    .line 58
    .line 59
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    if-eqz v3, :cond_5

    .line 63
    .line 64
    sget v7, Landroidx/fragment/R$id;->visible_removing_fragment_view_tag:I

    .line 65
    .line 66
    invoke-virtual {v3, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 73
    .line 74
    sget v7, Landroidx/fragment/R$id;->visible_removing_fragment_view_tag:I

    .line 75
    .line 76
    invoke-virtual {v3, v7, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 80
    .line 81
    if-eqz v3, :cond_6

    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eqz v3, :cond_6

    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_6
    invoke-virtual {v1, v2, v0, v5}, Landroidx/fragment/app/Fragment;->onCreateAnimation(IZI)Landroid/view/animation/Animation;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const/16 v7, 0x8

    .line 96
    .line 97
    if-eqz v3, :cond_7

    .line 98
    .line 99
    new-instance v6, Lwc0;

    .line 100
    .line 101
    invoke-direct {v6, v3, v7}, Lwc0;-><init>(Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :cond_7
    invoke-virtual {v1, v2, v0, v5}, Landroidx/fragment/app/Fragment;->onCreateAnimator(IZI)Landroid/animation/Animator;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_8

    .line 111
    .line 112
    new-instance v6, Lwc0;

    .line 113
    .line 114
    invoke-direct {v6, v1}, Lwc0;-><init>(Landroid/animation/Animator;)V

    .line 115
    .line 116
    .line 117
    goto/16 :goto_5

    .line 118
    .line 119
    :cond_8
    if-nez v5, :cond_13

    .line 120
    .line 121
    if-eqz v2, :cond_13

    .line 122
    .line 123
    const/16 v1, 0x1001

    .line 124
    .line 125
    if-eq v2, v1, :cond_11

    .line 126
    .line 127
    const/16 v1, 0x2002

    .line 128
    .line 129
    if-eq v2, v1, :cond_f

    .line 130
    .line 131
    const/16 v1, 0x2005

    .line 132
    .line 133
    if-eq v2, v1, :cond_d

    .line 134
    .line 135
    const/16 v1, 0x1003

    .line 136
    .line 137
    if-eq v2, v1, :cond_b

    .line 138
    .line 139
    const/16 v1, 0x1004

    .line 140
    .line 141
    if-eq v2, v1, :cond_9

    .line 142
    .line 143
    const/4 v0, -0x1

    .line 144
    :goto_2
    move v5, v0

    .line 145
    goto :goto_3

    .line 146
    :cond_9
    if-eqz v0, :cond_a

    .line 147
    .line 148
    const v0, 0x10100b8

    .line 149
    .line 150
    .line 151
    invoke-static {p1, v0}, Lmn0;->A(Landroid/content/Context;I)I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    goto :goto_2

    .line 156
    :cond_a
    const v0, 0x10100b9

    .line 157
    .line 158
    .line 159
    invoke-static {p1, v0}, Lmn0;->A(Landroid/content/Context;I)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    goto :goto_2

    .line 164
    :cond_b
    if-eqz v0, :cond_c

    .line 165
    .line 166
    sget v0, Landroidx/fragment/R$animator;->fragment_fade_enter:I

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_c
    sget v0, Landroidx/fragment/R$animator;->fragment_fade_exit:I

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_d
    if-eqz v0, :cond_e

    .line 173
    .line 174
    const v0, 0x10100ba

    .line 175
    .line 176
    .line 177
    invoke-static {p1, v0}, Lmn0;->A(Landroid/content/Context;I)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    goto :goto_2

    .line 182
    :cond_e
    const v0, 0x10100bb

    .line 183
    .line 184
    .line 185
    invoke-static {p1, v0}, Lmn0;->A(Landroid/content/Context;I)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    goto :goto_2

    .line 190
    :cond_f
    if-eqz v0, :cond_10

    .line 191
    .line 192
    sget v0, Landroidx/fragment/R$animator;->fragment_close_enter:I

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_10
    sget v0, Landroidx/fragment/R$animator;->fragment_close_exit:I

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_11
    if-eqz v0, :cond_12

    .line 199
    .line 200
    sget v0, Landroidx/fragment/R$animator;->fragment_open_enter:I

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_12
    sget v0, Landroidx/fragment/R$animator;->fragment_open_exit:I

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_13
    :goto_3
    if-eqz v5, :cond_16

    .line 207
    .line 208
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    const-string v1, "anim"

    .line 217
    .line 218
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_14

    .line 223
    .line 224
    :try_start_0
    invoke-static {p1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    if-eqz v1, :cond_16

    .line 229
    .line 230
    new-instance v2, Lwc0;

    .line 231
    .line 232
    invoke-direct {v2, v1, v7}, Lwc0;-><init>(Ljava/lang/Object;I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 233
    .line 234
    .line 235
    :goto_4
    move-object v6, v2

    .line 236
    goto :goto_5

    .line 237
    :catch_0
    move-exception p0

    .line 238
    throw p0

    .line 239
    :catch_1
    :cond_14
    :try_start_1
    invoke-static {p1, v5}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-eqz v1, :cond_16

    .line 244
    .line 245
    new-instance v2, Lwc0;

    .line 246
    .line 247
    invoke-direct {v2, v1}, Lwc0;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 248
    .line 249
    .line 250
    goto :goto_4

    .line 251
    :catch_2
    move-exception v1

    .line 252
    if-nez v0, :cond_15

    .line 253
    .line 254
    invoke-static {p1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    if-eqz p1, :cond_16

    .line 259
    .line 260
    new-instance v6, Lwc0;

    .line 261
    .line 262
    invoke-direct {v6, p1, v7}, Lwc0;-><init>(Ljava/lang/Object;I)V

    .line 263
    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_15
    throw v1

    .line 267
    :cond_16
    :goto_5
    iput-object v6, p0, Landroidx/fragment/app/d;->d:Lwc0;

    .line 268
    .line 269
    iput-boolean v4, p0, Landroidx/fragment/app/d;->c:Z

    .line 270
    .line 271
    return-object v6
.end method
