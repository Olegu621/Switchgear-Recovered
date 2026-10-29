.class public final synthetic Lio/sentry/android/core/internal/util/n;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/internal/util/r;

.field public final synthetic b:Lio/sentry/android/core/o0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/internal/util/r;Lio/sentry/android/core/o0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/internal/util/n;->a:Lio/sentry/android/core/internal/util/r;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/internal/util/n;->b:Lio/sentry/android/core/o0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lio/sentry/android/core/internal/util/n;->a:Lio/sentry/android/core/internal/util/r;

    .line 6
    .line 7
    iget-object v3, v2, Lio/sentry/android/core/internal/util/r;->Z:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    iget-object v0, v0, Lio/sentry/android/core/internal/util/n;->b:Lio/sentry/android/core/o0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v6, 0x1e

    .line 21
    .line 22
    if-lt v0, v6, :cond_0

    .line 23
    .line 24
    invoke-virtual/range {p1 .. p1}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {v6}, Lcom/appsflyer/internal/o;->e(Landroid/content/Context;)Landroid/view/Display;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v6}, Landroid/view/Display;->getRefreshRate()F

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    :goto_0
    move/from16 v18, v6

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v6}, Landroid/view/Display;->getRefreshRate()F

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    goto :goto_0

    .line 52
    :goto_1
    const v6, 0x4e6e6b28    # 1.0E9f

    .line 53
    .line 54
    .line 55
    div-float v7, v6, v18

    .line 56
    .line 57
    float-to-long v7, v7

    .line 58
    const/4 v9, 0x0

    .line 59
    invoke-virtual {v1, v9}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 60
    .line 61
    .line 62
    move-result-wide v10

    .line 63
    const/4 v12, 0x1

    .line 64
    invoke-virtual {v1, v12}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 65
    .line 66
    .line 67
    move-result-wide v13

    .line 68
    add-long/2addr v13, v10

    .line 69
    const/4 v10, 0x2

    .line 70
    invoke-virtual {v1, v10}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 71
    .line 72
    .line 73
    move-result-wide v10

    .line 74
    add-long/2addr v10, v13

    .line 75
    const/4 v13, 0x3

    .line 76
    invoke-virtual {v1, v13}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v13

    .line 80
    add-long/2addr v13, v10

    .line 81
    const/4 v10, 0x4

    .line 82
    invoke-virtual {v1, v10}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 83
    .line 84
    .line 85
    move-result-wide v10

    .line 86
    add-long/2addr v10, v13

    .line 87
    const/4 v13, 0x5

    .line 88
    invoke-virtual {v1, v13}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 89
    .line 90
    .line 91
    move-result-wide v13

    .line 92
    add-long/2addr v13, v10

    .line 93
    sub-long v7, v13, v7

    .line 94
    .line 95
    const-wide/16 v10, 0x0

    .line 96
    .line 97
    invoke-static {v10, v11, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide v7

    .line 101
    iget-object v15, v2, Lio/sentry/android/core/internal/util/r;->a:Lio/sentry/android/core/o0;

    .line 102
    .line 103
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const/16 v15, 0x1a

    .line 107
    .line 108
    if-lt v0, v15, :cond_1

    .line 109
    .line 110
    const/16 v0, 0xa

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    goto :goto_2

    .line 117
    :cond_1
    iget-object v0, v2, Lio/sentry/android/core/internal/util/r;->V:Landroid/view/Choreographer;

    .line 118
    .line 119
    if-eqz v0, :cond_2

    .line 120
    .line 121
    iget-object v1, v2, Lio/sentry/android/core/internal/util/r;->W:Ljava/lang/reflect/Field;

    .line 122
    .line 123
    if-eqz v1, :cond_2

    .line 124
    .line 125
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/Long;

    .line 130
    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    goto :goto_2

    .line 138
    :catch_0
    :cond_2
    const-wide/16 v0, -0x1

    .line 139
    .line 140
    :goto_2
    cmp-long v15, v0, v10

    .line 141
    .line 142
    if-gez v15, :cond_3

    .line 143
    .line 144
    sub-long v0, v4, v13

    .line 145
    .line 146
    :cond_3
    iget-wide v4, v2, Lio/sentry/android/core/internal/util/r;->Y:J

    .line 147
    .line 148
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 149
    .line 150
    .line 151
    move-result-wide v0

    .line 152
    iget-wide v4, v2, Lio/sentry/android/core/internal/util/r;->X:J

    .line 153
    .line 154
    cmp-long v4, v0, v4

    .line 155
    .line 156
    if-nez v4, :cond_4

    .line 157
    .line 158
    goto/16 :goto_6

    .line 159
    .line 160
    :cond_4
    iput-wide v0, v2, Lio/sentry/android/core/internal/util/r;->X:J

    .line 161
    .line 162
    add-long v4, v0, v13

    .line 163
    .line 164
    iput-wide v4, v2, Lio/sentry/android/core/internal/util/r;->Y:J

    .line 165
    .line 166
    const/high16 v15, 0x3f800000    # 1.0f

    .line 167
    .line 168
    sub-float v15, v18, v15

    .line 169
    .line 170
    div-float/2addr v6, v15

    .line 171
    move-wide v15, v10

    .line 172
    float-to-long v9, v6

    .line 173
    cmp-long v6, v13, v9

    .line 174
    .line 175
    move-wide v9, v15

    .line 176
    if-lez v6, :cond_5

    .line 177
    .line 178
    move/from16 v16, v12

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    const/16 v16, 0x0

    .line 182
    .line 183
    :goto_3
    if-eqz v16, :cond_6

    .line 184
    .line 185
    const-wide/32 v19, 0x29b92700

    .line 186
    .line 187
    .line 188
    cmp-long v6, v13, v19

    .line 189
    .line 190
    if-lez v6, :cond_6

    .line 191
    .line 192
    move/from16 v17, v12

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_6
    const/16 v17, 0x0

    .line 196
    .line 197
    :goto_4
    cmp-long v6, v7, v9

    .line 198
    .line 199
    if-lez v6, :cond_7

    .line 200
    .line 201
    const-wide v9, 0x45d964b800L

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    sub-long/2addr v4, v9

    .line 207
    new-instance v6, Lio/sentry/android/core/internal/util/p;

    .line 208
    .line 209
    invoke-direct {v6, v4, v5, v4, v5}, Lio/sentry/android/core/internal/util/p;-><init>(JJ)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentSkipListSet;->headSet(Ljava/lang/Object;)Ljava/util/NavigableSet;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-interface {v4}, Ljava/util/Set;->clear()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->size()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    const/16 v5, 0xe10

    .line 224
    .line 225
    if-ge v4, v5, :cond_7

    .line 226
    .line 227
    new-instance v4, Lio/sentry/android/core/internal/util/p;

    .line 228
    .line 229
    iget-wide v5, v2, Lio/sentry/android/core/internal/util/r;->Y:J

    .line 230
    .line 231
    invoke-direct {v4, v0, v1, v5, v6}, Lio/sentry/android/core/internal/util/p;-><init>(JJ)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    :cond_7
    iget-object v3, v2, Lio/sentry/android/core/internal/util/r;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_8

    .line 252
    .line 253
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    check-cast v4, Lio/sentry/android/core/internal/util/q;

    .line 258
    .line 259
    iget-wide v10, v2, Lio/sentry/android/core/internal/util/r;->Y:J

    .line 260
    .line 261
    move-wide v12, v13

    .line 262
    move-wide v14, v7

    .line 263
    move-wide v8, v0

    .line 264
    move-object v7, v4

    .line 265
    invoke-interface/range {v7 .. v18}, Lio/sentry/android/core/internal/util/q;->b(JJJJZZF)V

    .line 266
    .line 267
    .line 268
    move-wide v7, v14

    .line 269
    move-wide v13, v12

    .line 270
    goto :goto_5

    .line 271
    :cond_8
    :goto_6
    return-void
.end method
