.class public abstract Log0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Lr83;Landroidx/window/extensions/layout/FoldingFeature;)Lot0;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getType()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v3, :cond_1

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    sget-object v0, Lc5;->q:Lc5;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object v0, Lc5;->p:Lc5;

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getState()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eq v4, v3, :cond_3

    .line 26
    .line 27
    if-eq v4, v1, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    sget-object v1, Lr4;->m:Lr4;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    sget-object v1, Lr4;->l:Lr4;

    .line 34
    .line 35
    :goto_1
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 43
    .line 44
    iget v5, v3, Landroid/graphics/Rect;->top:I

    .line 45
    .line 46
    iget v6, v3, Landroid/graphics/Rect;->right:I

    .line 47
    .line 48
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 49
    .line 50
    if-gt v4, v6, :cond_9

    .line 51
    .line 52
    if-gt v5, v3, :cond_8

    .line 53
    .line 54
    iget-object p0, p0, Lr83;->a:Lwk;

    .line 55
    .line 56
    invoke-virtual {p0}, Lwk;->a()Landroid/graphics/Rect;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sub-int/2addr v3, v5

    .line 61
    if-nez v3, :cond_4

    .line 62
    .line 63
    sub-int v5, v6, v4

    .line 64
    .line 65
    if-nez v5, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    sub-int/2addr v6, v4

    .line 69
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eq v6, v4, :cond_5

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eq v3, v4, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-ge v6, v4, :cond_6

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-ge v3, v4, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-ne v6, v4, :cond_7

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-ne v3, p0, :cond_7

    .line 106
    .line 107
    :goto_2
    return-object v2

    .line 108
    :cond_7
    new-instance p0, Lot0;

    .line 109
    .line 110
    new-instance v2, Lwk;

    .line 111
    .line 112
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-direct {v2, p1}, Lwk;-><init>(Landroid/graphics/Rect;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p0, v2, v0, v1}, Lot0;-><init>(Lwk;Lc5;Lr4;)V

    .line 123
    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_8
    const-string p0, "top must be less than or equal to bottom, top: "

    .line 127
    .line 128
    const-string p1, ", bottom: "

    .line 129
    .line 130
    invoke-static {p0, v5, v3, p1}, Len;->j(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lds0;->q(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-object v2

    .line 138
    :cond_9
    const-string p0, "Left must be less than or equal to right, left: "

    .line 139
    .line 140
    const-string p1, ", right: "

    .line 141
    .line 142
    invoke-static {p0, v4, v6, p1}, Len;->j(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, Lds0;->q(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    return-object v2
.end method

.method public static b(Lr83;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lq83;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/window/extensions/layout/WindowLayoutInfo;->getDisplayFeatures()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroidx/window/extensions/layout/DisplayFeature;

    .line 31
    .line 32
    instance-of v2, v1, Landroidx/window/extensions/layout/FoldingFeature;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast v1, Landroidx/window/extensions/layout/FoldingFeature;

    .line 40
    .line 41
    invoke-static {p0, v1}, Log0;->a(Lr83;Landroidx/window/extensions/layout/FoldingFeature;)Lot0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/4 v1, 0x0

    .line 47
    :goto_1
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance p0, Lq83;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Lq83;-><init>(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method public static c(Landroid/content/Context;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lq83;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/16 v2, 0x1d

    .line 8
    .line 9
    const/16 v3, 0x1e

    .line 10
    .line 11
    if-lt v0, v3, :cond_9

    .line 12
    .line 13
    sget v4, Lt83;->b:I

    .line 14
    .line 15
    if-lt v0, v3, :cond_0

    .line 16
    .line 17
    const-class v0, Landroid/view/WindowManager;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Landroid/view/WindowManager;

    .line 24
    .line 25
    invoke-static {p0}, Lw0;->y(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lw0;->k(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, v1}, Lm83;->h(Landroid/view/WindowInsets;Landroid/view/View;)Lm83;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Lr83;

    .line 38
    .line 39
    invoke-static {p0}, Lw0;->C(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lw0;->f(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, p0, v0}, Lr83;-><init>(Landroid/graphics/Rect;Lm83;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_0
    move-object v0, p0

    .line 56
    :goto_0
    instance-of v4, v0, Landroid/content/ContextWrapper;

    .line 57
    .line 58
    const-string v5, " is not a UiContext"

    .line 59
    .line 60
    if-eqz v4, :cond_8

    .line 61
    .line 62
    instance-of v4, v0, Landroid/app/Activity;

    .line 63
    .line 64
    if-eqz v4, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    instance-of v6, v0, Landroid/inputmethodservice/InputMethodService;

    .line 68
    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move-object v6, v0

    .line 73
    check-cast v6, Landroid/content/ContextWrapper;

    .line 74
    .line 75
    invoke-virtual {v6}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    if-nez v7, :cond_7

    .line 80
    .line 81
    :goto_1
    if-eqz v4, :cond_3

    .line 82
    .line 83
    check-cast p0, Landroid/app/Activity;

    .line 84
    .line 85
    invoke-static {p0}, Lt83;->a(Landroid/app/Activity;)Lr83;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    instance-of v0, v0, Landroid/inputmethodservice/InputMethodService;

    .line 91
    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    const-string v0, "window"

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    check-cast p0, Landroid/view/WindowManager;

    .line 104
    .line 105
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v0, Landroid/graphics/Point;

    .line 113
    .line 114
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 118
    .line 119
    .line 120
    new-instance p0, Landroid/graphics/Rect;

    .line 121
    .line 122
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 123
    .line 124
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    invoke-direct {p0, v4, v4, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 128
    .line 129
    .line 130
    new-instance v1, Lr83;

    .line 131
    .line 132
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 133
    .line 134
    if-lt v0, v3, :cond_4

    .line 135
    .line 136
    new-instance v0, Lb83;

    .line 137
    .line 138
    invoke-direct {v0}, Lb83;-><init>()V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    if-lt v0, v2, :cond_5

    .line 143
    .line 144
    new-instance v0, La83;

    .line 145
    .line 146
    invoke-direct {v0}, La83;-><init>()V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    new-instance v0, Lz73;

    .line 151
    .line 152
    invoke-direct {v0}, Lz73;-><init>()V

    .line 153
    .line 154
    .line 155
    :goto_2
    invoke-virtual {v0}, Lc83;->b()Lm83;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-direct {v1, p0, v0}, Lr83;-><init>(Landroid/graphics/Rect;Lm83;)V

    .line 163
    .line 164
    .line 165
    :goto_3
    invoke-static {v1, p1}, Log0;->b(Lr83;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lq83;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_7
    invoke-virtual {v6}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_8
    const-string p1, "Context "

    .line 201
    .line 202
    invoke-static {p0, p1, v5}, Lio/sentry/u2;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    return-object v1

    .line 206
    :cond_9
    if-lt v0, v2, :cond_a

    .line 207
    .line 208
    instance-of v0, p0, Landroid/app/Activity;

    .line 209
    .line 210
    if-eqz v0, :cond_a

    .line 211
    .line 212
    sget v0, Lt83;->b:I

    .line 213
    .line 214
    check-cast p0, Landroid/app/Activity;

    .line 215
    .line 216
    invoke-static {p0}, Lt83;->a(Landroid/app/Activity;)Lr83;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-static {p0, p1}, Log0;->b(Lr83;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lq83;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :cond_a
    const-string p0, "Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q."

    .line 226
    .line 227
    invoke-static {p0}, Ln4;->q(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return-object v1
.end method
