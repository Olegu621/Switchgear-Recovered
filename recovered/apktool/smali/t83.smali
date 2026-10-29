.class public final Lt83;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ls83;


# static fields
.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x4

    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const/16 v4, 0x8

    .line 17
    .line 18
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/16 v5, 0x10

    .line 23
    .line 24
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const/16 v6, 0x20

    .line 29
    .line 30
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const/16 v7, 0x40

    .line 35
    .line 36
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const/16 v8, 0x80

    .line 41
    .line 42
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    filled-new-array/range {v1 .. v8}, [Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    new-instance v3, Lzc;

    .line 53
    .line 54
    invoke-direct {v3, v1, v0}, Lzc;-><init>([Ljava/lang/Object;Z)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static a(Landroid/app/Activity;)Lr83;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/16 v2, 0x1e

    .line 6
    .line 7
    if-lt v0, v2, :cond_0

    .line 8
    .line 9
    const-class v0, Landroid/view/WindowManager;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/view/WindowManager;

    .line 16
    .line 17
    invoke-static {v0}, Lw0;->y(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lw0;->f(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    if-lt v0, v1, :cond_1

    .line 31
    .line 32
    const-string v0, "t83"

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :try_start_0
    const-class v4, Landroid/content/res/Configuration;

    .line 43
    .line 44
    const-string v5, "windowConfiguration"

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const/4 v5, 0x1

    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v5, "getBounds"

    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    new-instance v5, Landroid/graphics/Rect;

    .line 70
    .line 71
    invoke-virtual {v4, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    check-cast v3, Landroid/graphics/Rect;

    .line 79
    .line 80
    invoke-direct {v5, v3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    move-object v0, v5

    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :catch_0
    move-exception v3

    .line 87
    goto :goto_0

    .line 88
    :catch_1
    move-exception v3

    .line 89
    goto :goto_1

    .line 90
    :catch_2
    move-exception v3

    .line 91
    goto :goto_2

    .line 92
    :catch_3
    move-exception v3

    .line 93
    goto :goto_3

    .line 94
    :goto_0
    invoke-static {v0, v3}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0}, Lt83;->b(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    goto :goto_5

    .line 102
    :goto_1
    invoke-static {v0, v3}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0}, Lt83;->b(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_5

    .line 110
    :goto_2
    invoke-static {v0, v3}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, Lt83;->b(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    goto :goto_5

    .line 118
    :goto_3
    invoke-static {v0, v3}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p0}, Lt83;->b(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_5

    .line 126
    :cond_1
    const/16 v3, 0x1c

    .line 127
    .line 128
    if-lt v0, v3, :cond_2

    .line 129
    .line 130
    invoke-static {p0}, Lt83;->b(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    goto :goto_5

    .line 135
    :cond_2
    new-instance v0, Landroid/graphics/Rect;

    .line 136
    .line 137
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3, v0}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_5

    .line 156
    .line 157
    new-instance v4, Landroid/graphics/Point;

    .line 158
    .line 159
    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v4}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const-string v5, "dimen"

    .line 170
    .line 171
    const-string v6, "android"

    .line 172
    .line 173
    const-string v7, "navigation_bar_height"

    .line 174
    .line 175
    invoke-virtual {v3, v7, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-lez v5, :cond_3

    .line 180
    .line 181
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    goto :goto_4

    .line 186
    :cond_3
    const/4 v3, 0x0

    .line 187
    :goto_4
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 188
    .line 189
    add-int/2addr v5, v3

    .line 190
    iget v6, v4, Landroid/graphics/Point;->y:I

    .line 191
    .line 192
    if-ne v5, v6, :cond_4

    .line 193
    .line 194
    iput v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_4
    iget v5, v0, Landroid/graphics/Rect;->right:I

    .line 198
    .line 199
    add-int/2addr v5, v3

    .line 200
    iget v3, v4, Landroid/graphics/Point;->x:I

    .line 201
    .line 202
    if-ne v5, v3, :cond_5

    .line 203
    .line 204
    iput v5, v0, Landroid/graphics/Rect;->right:I

    .line 205
    .line 206
    :cond_5
    :goto_5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 207
    .line 208
    if-lt v3, v2, :cond_7

    .line 209
    .line 210
    if-lt v3, v2, :cond_6

    .line 211
    .line 212
    sget-object v1, Lw00;->a:Lw00;

    .line 213
    .line 214
    invoke-virtual {v1, p0}, Lw00;->a(Landroid/content/Context;)Lm83;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    goto :goto_7

    .line 219
    :cond_6
    new-instance p0, Ljava/lang/Exception;

    .line 220
    .line 221
    const-string v0, "Incompatible SDK version"

    .line 222
    .line 223
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p0

    .line 227
    :cond_7
    if-lt v3, v2, :cond_8

    .line 228
    .line 229
    new-instance p0, Lb83;

    .line 230
    .line 231
    invoke-direct {p0}, Lb83;-><init>()V

    .line 232
    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_8
    if-lt v3, v1, :cond_9

    .line 236
    .line 237
    new-instance p0, La83;

    .line 238
    .line 239
    invoke-direct {p0}, La83;-><init>()V

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_9
    new-instance p0, Lz73;

    .line 244
    .line 245
    invoke-direct {p0}, Lz73;-><init>()V

    .line 246
    .line 247
    .line 248
    :goto_6
    invoke-virtual {p0}, Lc83;->b()Lm83;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    :goto_7
    new-instance v1, Lr83;

    .line 256
    .line 257
    new-instance v2, Lwk;

    .line 258
    .line 259
    invoke-direct {v2, v0}, Lwk;-><init>(Landroid/graphics/Rect;)V

    .line 260
    .line 261
    .line 262
    invoke-direct {v1, v2, p0}, Lr83;-><init>(Lwk;Lm83;)V

    .line 263
    .line 264
    .line 265
    return-object v1
.end method

.method public static b(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 11

    .line 1
    const-string v0, "t83"

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    :try_start_0
    const-class v5, Landroid/content/res/Configuration;

    .line 19
    .line 20
    const-string v6, "windowConfiguration"

    .line 21
    .line 22
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-string v6, "getBounds"

    .line 44
    .line 45
    invoke-virtual {v5, v6, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast v2, Landroid/graphics/Rect;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 59
    .line 60
    .line 61
    goto :goto_4

    .line 62
    :catch_0
    move-exception v2

    .line 63
    goto :goto_0

    .line 64
    :catch_1
    move-exception v2

    .line 65
    goto :goto_1

    .line 66
    :catch_2
    move-exception v2

    .line 67
    goto :goto_2

    .line 68
    :catch_3
    move-exception v2

    .line 69
    goto :goto_3

    .line 70
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const-string v6, "getAppBounds"

    .line 75
    .line 76
    invoke-virtual {v5, v6, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast v2, Landroid/graphics/Rect;

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :goto_0
    invoke-static {v0, v2}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2, v1}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :goto_1
    invoke-static {v0, v2}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2, v1}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :goto_2
    invoke-static {v0, v2}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2, v1}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :goto_3
    invoke-static {v0, v2}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2, v1}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 150
    .line 151
    .line 152
    :goto_4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    new-instance v5, Landroid/graphics/Point;

    .line 161
    .line 162
    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v5}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    const/4 v7, 0x0

    .line 176
    if-nez v6, :cond_4

    .line 177
    .line 178
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    const-string v8, "dimen"

    .line 183
    .line 184
    const-string v9, "android"

    .line 185
    .line 186
    const-string v10, "navigation_bar_height"

    .line 187
    .line 188
    invoke-virtual {v6, v10, v8, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-lez v8, :cond_1

    .line 193
    .line 194
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    goto :goto_5

    .line 199
    :cond_1
    move v6, v7

    .line 200
    :goto_5
    iget v8, v1, Landroid/graphics/Rect;->bottom:I

    .line 201
    .line 202
    add-int/2addr v8, v6

    .line 203
    iget v9, v5, Landroid/graphics/Point;->y:I

    .line 204
    .line 205
    if-ne v8, v9, :cond_2

    .line 206
    .line 207
    iput v8, v1, Landroid/graphics/Rect;->bottom:I

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_2
    iget v8, v1, Landroid/graphics/Rect;->right:I

    .line 211
    .line 212
    add-int/2addr v8, v6

    .line 213
    iget v9, v5, Landroid/graphics/Point;->x:I

    .line 214
    .line 215
    if-ne v8, v9, :cond_3

    .line 216
    .line 217
    iput v8, v1, Landroid/graphics/Rect;->right:I

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_3
    iget v8, v1, Landroid/graphics/Rect;->left:I

    .line 221
    .line 222
    if-ne v8, v6, :cond_4

    .line 223
    .line 224
    iput v7, v1, Landroid/graphics/Rect;->left:I

    .line 225
    .line 226
    :cond_4
    :goto_6
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    iget v8, v5, Landroid/graphics/Point;->x:I

    .line 231
    .line 232
    if-lt v6, v8, :cond_5

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    iget v8, v5, Landroid/graphics/Point;->y:I

    .line 239
    .line 240
    if-ge v6, v8, :cond_a

    .line 241
    .line 242
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    if-nez p0, :cond_a

    .line 247
    .line 248
    :try_start_1
    const-string p0, "android.view.DisplayInfo"

    .line 249
    .line 250
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-virtual {p0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    const-string v8, "getDisplayInfo"

    .line 270
    .line 271
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 284
    .line 285
    .line 286
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-virtual {v6, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const-string v6, "displayCutout"

    .line 298
    .line 299
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-static {p0}, Lrt1;->o(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_6

    .line 315
    .line 316
    invoke-static {p0}, Lrt1;->g(Ljava/lang/Object;)Landroid/view/DisplayCutout;

    .line 317
    .line 318
    .line 319
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_4

    .line 320
    goto :goto_d

    .line 321
    :catch_4
    move-exception p0

    .line 322
    goto :goto_7

    .line 323
    :catch_5
    move-exception p0

    .line 324
    goto :goto_8

    .line 325
    :catch_6
    move-exception p0

    .line 326
    goto :goto_9

    .line 327
    :catch_7
    move-exception p0

    .line 328
    goto :goto_a

    .line 329
    :catch_8
    move-exception p0

    .line 330
    goto :goto_b

    .line 331
    :catch_9
    move-exception p0

    .line 332
    goto :goto_c

    .line 333
    :goto_7
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 334
    .line 335
    .line 336
    goto :goto_d

    .line 337
    :goto_8
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 338
    .line 339
    .line 340
    goto :goto_d

    .line 341
    :goto_9
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 342
    .line 343
    .line 344
    goto :goto_d

    .line 345
    :goto_a
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 346
    .line 347
    .line 348
    goto :goto_d

    .line 349
    :goto_b
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 350
    .line 351
    .line 352
    goto :goto_d

    .line 353
    :goto_c
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 354
    .line 355
    .line 356
    :cond_6
    :goto_d
    if-eqz v4, :cond_a

    .line 357
    .line 358
    iget p0, v1, Landroid/graphics/Rect;->left:I

    .line 359
    .line 360
    invoke-static {v4}, Lq0;->x(Landroid/view/DisplayCutout;)I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-ne p0, v0, :cond_7

    .line 365
    .line 366
    iput v7, v1, Landroid/graphics/Rect;->left:I

    .line 367
    .line 368
    :cond_7
    iget p0, v5, Landroid/graphics/Point;->x:I

    .line 369
    .line 370
    iget v0, v1, Landroid/graphics/Rect;->right:I

    .line 371
    .line 372
    sub-int/2addr p0, v0

    .line 373
    invoke-static {v4}, Lq0;->C(Landroid/view/DisplayCutout;)I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-ne p0, v0, :cond_8

    .line 378
    .line 379
    iget p0, v1, Landroid/graphics/Rect;->right:I

    .line 380
    .line 381
    invoke-static {v4}, Lq0;->C(Landroid/view/DisplayCutout;)I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    add-int/2addr v0, p0

    .line 386
    iput v0, v1, Landroid/graphics/Rect;->right:I

    .line 387
    .line 388
    :cond_8
    iget p0, v1, Landroid/graphics/Rect;->top:I

    .line 389
    .line 390
    invoke-static {v4}, Lq0;->a(Landroid/view/DisplayCutout;)I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-ne p0, v0, :cond_9

    .line 395
    .line 396
    iput v7, v1, Landroid/graphics/Rect;->top:I

    .line 397
    .line 398
    :cond_9
    iget p0, v5, Landroid/graphics/Point;->y:I

    .line 399
    .line 400
    iget v0, v1, Landroid/graphics/Rect;->bottom:I

    .line 401
    .line 402
    sub-int/2addr p0, v0

    .line 403
    invoke-static {v4}, Lq0;->A(Landroid/view/DisplayCutout;)I

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    if-ne p0, v0, :cond_a

    .line 408
    .line 409
    iget p0, v1, Landroid/graphics/Rect;->bottom:I

    .line 410
    .line 411
    invoke-static {v4}, Lq0;->A(Landroid/view/DisplayCutout;)I

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    add-int/2addr v0, p0

    .line 416
    iput v0, v1, Landroid/graphics/Rect;->bottom:I

    .line 417
    .line 418
    :cond_a
    return-object v1
.end method
