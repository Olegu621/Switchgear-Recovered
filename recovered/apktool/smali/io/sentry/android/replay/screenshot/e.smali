.class public final synthetic Lio/sentry/android/replay/screenshot/e;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/sentry/android/replay/screenshot/h;

.field public final synthetic b:[Lcd1;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Landroid/view/View;

.field public final synthetic f:Lio/sentry/android/replay/viewhierarchy/h;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/screenshot/h;[Lcd1;IILandroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/replay/screenshot/e;->a:Lio/sentry/android/replay/screenshot/h;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/replay/screenshot/e;->b:[Lcd1;

    .line 7
    .line 8
    iput p3, p0, Lio/sentry/android/replay/screenshot/e;->c:I

    .line 9
    .line 10
    iput p4, p0, Lio/sentry/android/replay/screenshot/e;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lio/sentry/android/replay/screenshot/e;->e:Landroid/view/View;

    .line 13
    .line 14
    iput-object p6, p0, Lio/sentry/android/replay/screenshot/e;->f:Lio/sentry/android/replay/viewhierarchy/h;

    .line 15
    .line 16
    iput-boolean p7, p0, Lio/sentry/android/replay/screenshot/e;->i:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/android/replay/screenshot/e;->a:Lio/sentry/android/replay/screenshot/h;

    .line 4
    .line 5
    iget-object v2, v1, Lio/sentry/android/replay/screenshot/h;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, v0, Lio/sentry/android/replay/screenshot/e;->b:[Lcd1;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    iget-object v2, v1, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    array-length v2, v3

    .line 27
    move v5, v4

    .line 28
    :goto_0
    if-ge v5, v2, :cond_2

    .line 29
    .line 30
    aget-object v6, v3, v5

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    iget-object v7, v6, Lcd1;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, Landroid/graphics/Bitmap;

    .line 37
    .line 38
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-nez v8, :cond_1

    .line 43
    .line 44
    iget-object v8, v1, Lio/sentry/android/replay/screenshot/h;->o:Lp51;

    .line 45
    .line 46
    invoke-interface {v8}, Lp51;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, Landroid/graphics/Canvas;

    .line 51
    .line 52
    iget-object v9, v1, Lio/sentry/android/replay/screenshot/h;->n:Lp51;

    .line 53
    .line 54
    invoke-interface {v9}, Lp51;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    check-cast v9, Landroid/graphics/Paint;

    .line 59
    .line 60
    iget-object v10, v1, Lio/sentry/android/replay/screenshot/h;->p:Landroid/graphics/Rect;

    .line 61
    .line 62
    iget-object v11, v1, Lio/sentry/android/replay/screenshot/h;->q:Landroid/graphics/RectF;

    .line 63
    .line 64
    iget v12, v6, Lcd1;->a:I

    .line 65
    .line 66
    iget v6, v6, Lcd1;->b:I

    .line 67
    .line 68
    iget-object v13, v1, Lio/sentry/android/replay/screenshot/h;->c:Lio/sentry/android/replay/x;

    .line 69
    .line 70
    iget v14, v13, Lio/sentry/android/replay/x;->c:F

    .line 71
    .line 72
    iget v13, v13, Lio/sentry/android/replay/x;->d:F

    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget v15, v0, Lio/sentry/android/replay/screenshot/e;->c:I

    .line 87
    .line 88
    sub-int/2addr v12, v15

    .line 89
    int-to-float v12, v12

    .line 90
    mul-float/2addr v12, v14

    .line 91
    iget v15, v0, Lio/sentry/android/replay/screenshot/e;->d:I

    .line 92
    .line 93
    sub-int/2addr v6, v15

    .line 94
    int-to-float v6, v6

    .line 95
    mul-float/2addr v6, v13

    .line 96
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result v15

    .line 100
    move/from16 v16, v2

    .line 101
    .line 102
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v10, v4, v4, v15, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    int-to-float v2, v2

    .line 114
    mul-float/2addr v2, v14

    .line 115
    add-float/2addr v2, v12

    .line 116
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    .line 117
    .line 118
    .line 119
    move-result v14

    .line 120
    int-to-float v14, v14

    .line 121
    mul-float/2addr v14, v13

    .line 122
    add-float/2addr v14, v6

    .line 123
    invoke-virtual {v11, v12, v6, v2, v14}, Landroid/graphics/RectF;->set(FFFF)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8, v7, v10, v11, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    move/from16 v16, v2

    .line 134
    .line 135
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    move/from16 v2, v16

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    iget-object v2, v0, Lio/sentry/android/replay/screenshot/e;->e:Landroid/view/View;

    .line 141
    .line 142
    iget-object v3, v0, Lio/sentry/android/replay/screenshot/e;->f:Lio/sentry/android/replay/viewhierarchy/h;

    .line 143
    .line 144
    iget-boolean v0, v0, Lio/sentry/android/replay/screenshot/e;->i:Z

    .line 145
    .line 146
    invoke-virtual {v1, v2, v3, v0}, Lio/sentry/android/replay/screenshot/h;->d(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Z)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_3
    :goto_2
    iget-object v0, v1, Lio/sentry/android/replay/screenshot/h;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 151
    .line 152
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 157
    .line 158
    const-string v2, "PixelCopyStrategy is closed, skipping compositing"

    .line 159
    .line 160
    new-array v5, v4, [Ljava/lang/Object;

    .line 161
    .line 162
    invoke-interface {v0, v1, v2, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    array-length v0, v3

    .line 166
    :goto_3
    if-ge v4, v0, :cond_5

    .line 167
    .line 168
    aget-object v1, v3, v4

    .line 169
    .line 170
    if-eqz v1, :cond_4

    .line 171
    .line 172
    iget-object v1, v1, Lcd1;->c:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v1, Landroid/graphics/Bitmap;

    .line 175
    .line 176
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_4

    .line 181
    .line 182
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 183
    .line 184
    .line 185
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    return-void
.end method
