.class public final Lio/sentry/android/core/f1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/c0;


# instance fields
.field public final a:Lio/sentry/android/core/d;

.field public final b:Lio/sentry/android/core/SentryAndroidOptions;

.field public final c:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/f1;->c:Lio/sentry/util/a;

    .line 10
    .line 11
    iput-object p1, p0, Lio/sentry/android/core/f1;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 12
    .line 13
    iput-object p2, p0, Lio/sentry/android/core/f1;->a:Lio/sentry/android/core/d;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Lio/sentry/android/core/performance/g;Lio/sentry/protocol/f0;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object v0, p1, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 10
    .line 11
    iget-object p1, p1, Lio/sentry/protocol/f0;->d0:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_1
    iget-object v1, v0, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lio/sentry/protocol/z;

    .line 38
    .line 39
    iget-object v4, v3, Lio/sentry/protocol/z;->f:Ljava/lang/String;

    .line 40
    .line 41
    const-string v5, "app.start.cold"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    iget-object v2, v3, Lio/sentry/protocol/z;->d:Lio/sentry/d7;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 v2, 0x0

    .line 53
    :goto_0
    const-string v3, "app.start"

    .line 54
    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    iget-object v4, v0, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    iget-object v2, v0, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 66
    .line 67
    :cond_4
    iget-object v0, v0, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    new-instance v3, Lio/sentry/android/core/performance/h;

    .line 74
    .line 75
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    iget-object v4, p0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 79
    .line 80
    iget-wide v5, v4, Lio/sentry/android/core/performance/h;->b:J

    .line 81
    .line 82
    iget-wide v7, v4, Lio/sentry/android/core/performance/h;->c:J

    .line 83
    .line 84
    sget-wide v9, Lio/sentry/android/core/performance/g;->j0:J

    .line 85
    .line 86
    const-string v4, "Process Initialization"

    .line 87
    .line 88
    iput-object v4, v3, Lio/sentry/android/core/performance/h;->a:Ljava/lang/String;

    .line 89
    .line 90
    iput-wide v5, v3, Lio/sentry/android/core/performance/h;->b:J

    .line 91
    .line 92
    iput-wide v7, v3, Lio/sentry/android/core/performance/h;->c:J

    .line 93
    .line 94
    iput-wide v9, v3, Lio/sentry/android/core/performance/h;->d:J

    .line 95
    .line 96
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->d()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_5

    .line 101
    .line 102
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->a()J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 107
    .line 108
    .line 109
    move-result-wide v4

    .line 110
    const-wide/16 v6, 0x2710

    .line 111
    .line 112
    cmp-long v4, v4, v6

    .line 113
    .line 114
    if-gtz v4, :cond_5

    .line 115
    .line 116
    const-string v4, "process.load"

    .line 117
    .line 118
    invoke-static {v3, v2, v1, v4, v0}, Lio/sentry/android/core/f1;->e(Lio/sentry/android/core/performance/h;Lio/sentry/d7;Lio/sentry/protocol/w;Ljava/lang/String;Z)Lio/sentry/protocol/z;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    .line 126
    .line 127
    iget-object v4, p0, Lio/sentry/android/core/performance/g;->i:Ljava/util/HashMap;

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-nez v4, :cond_6

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Lio/sentry/android/core/performance/h;

    .line 160
    .line 161
    const-string v5, "contentprovider.load"

    .line 162
    .line 163
    invoke-static {v4, v2, v1, v5, v0}, Lio/sentry/android/core/f1;->e(Lio/sentry/android/core/performance/h;Lio/sentry/d7;Lio/sentry/protocol/w;Ljava/lang/String;Z)Lio/sentry/protocol/z;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_6
    iget-object p0, p0, Lio/sentry/android/core/performance/g;->f:Lio/sentry/android/core/performance/h;

    .line 172
    .line 173
    invoke-virtual {p0}, Lio/sentry/android/core/performance/h;->e()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eqz v3, :cond_7

    .line 178
    .line 179
    const-string v3, "application.load"

    .line 180
    .line 181
    invoke-static {p0, v2, v1, v3, v0}, Lio/sentry/android/core/f1;->e(Lio/sentry/android/core/performance/h;Lio/sentry/d7;Lio/sentry/protocol/w;Ljava/lang/String;Z)Lio/sentry/protocol/z;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :cond_7
    :goto_2
    return-void
.end method

.method public static b(Lio/sentry/protocol/f0;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/protocol/f0;->d0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lio/sentry/protocol/z;

    .line 18
    .line 19
    iget-object v2, v1, Lio/sentry/protocol/z;->f:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, "app.start.cold"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    iget-object v1, v1, Lio/sentry/protocol/z;->f:Ljava/lang/String;

    .line 30
    .line 31
    const-string v2, "app.start.warm"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object p0, p0, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 41
    .line 42
    invoke-virtual {p0}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    iget-object p0, p0, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 49
    .line 50
    const-string v0, "app.start"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_3
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method public static d(Lio/sentry/protocol/f0;)V
    .locals 11

    .line 1
    iget-object p0, p0, Lio/sentry/protocol/f0;->d0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move-object v2, v1

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_3

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lio/sentry/protocol/z;

    .line 20
    .line 21
    const-string v4, "ui.load.initial_display"

    .line 22
    .line 23
    iget-object v5, v3, Lio/sentry/protocol/z;->f:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    move-object v1, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string v4, "ui.load.full_display"

    .line 34
    .line 35
    iget-object v5, v3, Lio/sentry/protocol/z;->f:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    move-object v2, v3

    .line 44
    :cond_2
    :goto_0
    if-eqz v1, :cond_0

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    :cond_3
    if-nez v1, :cond_4

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :cond_5
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_10

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lio/sentry/protocol/z;

    .line 69
    .line 70
    if-eq v0, v1, :cond_5

    .line 71
    .line 72
    if-ne v0, v2, :cond_6

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_6
    iget-object v3, v0, Lio/sentry/protocol/z;->V:Ljava/util/Map;

    .line 76
    .line 77
    iget-object v4, v0, Lio/sentry/protocol/z;->a:Ljava/lang/Double;

    .line 78
    .line 79
    const/4 v5, 0x0

    .line 80
    const/4 v6, 0x1

    .line 81
    if-eqz v3, :cond_8

    .line 82
    .line 83
    const-string v7, "thread.name"

    .line 84
    .line 85
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    if-eqz v3, :cond_8

    .line 90
    .line 91
    const-string v7, "main"

    .line 92
    .line 93
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_7

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    move v3, v5

    .line 101
    goto :goto_3

    .line 102
    :cond_8
    :goto_2
    move v3, v6

    .line 103
    :goto_3
    if-eqz v1, :cond_a

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 106
    .line 107
    .line 108
    move-result-wide v7

    .line 109
    iget-object v9, v1, Lio/sentry/protocol/z;->a:Ljava/lang/Double;

    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 112
    .line 113
    .line 114
    move-result-wide v9

    .line 115
    cmpl-double v9, v7, v9

    .line 116
    .line 117
    if-ltz v9, :cond_a

    .line 118
    .line 119
    iget-object v9, v1, Lio/sentry/protocol/z;->b:Ljava/lang/Double;

    .line 120
    .line 121
    if-eqz v9, :cond_9

    .line 122
    .line 123
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 124
    .line 125
    .line 126
    move-result-wide v9

    .line 127
    cmpg-double v7, v7, v9

    .line 128
    .line 129
    if-gtz v7, :cond_a

    .line 130
    .line 131
    :cond_9
    if-eqz v3, :cond_a

    .line 132
    .line 133
    move v3, v6

    .line 134
    goto :goto_4

    .line 135
    :cond_a
    move v3, v5

    .line 136
    :goto_4
    if-eqz v2, :cond_c

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 139
    .line 140
    .line 141
    move-result-wide v7

    .line 142
    iget-object v4, v2, Lio/sentry/protocol/z;->a:Ljava/lang/Double;

    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 145
    .line 146
    .line 147
    move-result-wide v9

    .line 148
    cmpl-double v4, v7, v9

    .line 149
    .line 150
    if-ltz v4, :cond_c

    .line 151
    .line 152
    iget-object v4, v2, Lio/sentry/protocol/z;->b:Ljava/lang/Double;

    .line 153
    .line 154
    if-eqz v4, :cond_b

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 157
    .line 158
    .line 159
    move-result-wide v9

    .line 160
    cmpg-double v4, v7, v9

    .line 161
    .line 162
    if-gtz v4, :cond_c

    .line 163
    .line 164
    :cond_b
    move v5, v6

    .line 165
    :cond_c
    if-nez v3, :cond_d

    .line 166
    .line 167
    if-eqz v5, :cond_5

    .line 168
    .line 169
    :cond_d
    iget-object v4, v0, Lio/sentry/protocol/z;->V:Ljava/util/Map;

    .line 170
    .line 171
    if-nez v4, :cond_e

    .line 172
    .line 173
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 174
    .line 175
    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 176
    .line 177
    .line 178
    iput-object v4, v0, Lio/sentry/protocol/z;->V:Ljava/util/Map;

    .line 179
    .line 180
    :cond_e
    if-eqz v3, :cond_f

    .line 181
    .line 182
    const-string v0, "ui.contributes_to_ttid"

    .line 183
    .line 184
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    :cond_f
    if-eqz v5, :cond_5

    .line 190
    .line 191
    const-string v0, "ui.contributes_to_ttfd"

    .line 192
    .line 193
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    goto/16 :goto_1

    .line 199
    .line 200
    :cond_10
    :goto_5
    return-void
.end method

.method public static e(Lio/sentry/android/core/performance/h;Lio/sentry/d7;Lio/sentry/protocol/w;Ljava/lang/String;Z)Lio/sentry/protocol/z;
    .locals 13

    .line 1
    new-instance v12, Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {v12, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-wide v0, Lio/sentry/android/core/internal/util/e;->b:J

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "thread.id"

    .line 14
    .line 15
    invoke-virtual {v12, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const-string v0, "thread.name"

    .line 19
    .line 20
    const-string v1, "main"

    .line 21
    .line 22
    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    if-nez p4, :cond_0

    .line 26
    .line 27
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    const-string v1, "ui.contributes_to_ttid"

    .line 30
    .line 31
    invoke-virtual {v12, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const-string v1, "ui.contributes_to_ttfd"

    .line 35
    .line 36
    invoke-virtual {v12, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    new-instance v0, Lio/sentry/protocol/z;

    .line 40
    .line 41
    iget-wide v1, p0, Lio/sentry/android/core/performance/h;->b:J

    .line 42
    .line 43
    long-to-double v1, v1

    .line 44
    const-wide v3, 0x408f400000000000L    # 1000.0

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    div-double/2addr v1, v3

    .line 50
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0}, Lio/sentry/android/core/performance/h;->d()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    iget-wide v5, p0, Lio/sentry/android/core/performance/h;->b:J

    .line 61
    .line 62
    invoke-virtual {p0}, Lio/sentry/android/core/performance/h;->a()J

    .line 63
    .line 64
    .line 65
    move-result-wide v7

    .line 66
    add-long/2addr v7, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    :goto_0
    long-to-double v5, v7

    .line 71
    div-double/2addr v5, v3

    .line 72
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-instance v4, Lio/sentry/d7;

    .line 77
    .line 78
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v7, p0, Lio/sentry/android/core/performance/h;->a:Ljava/lang/String;

    .line 82
    .line 83
    sget-object v8, Lio/sentry/f7;->OK:Lio/sentry/f7;

    .line 84
    .line 85
    new-instance v10, Ljava/util/concurrent/ConcurrentHashMap;

    .line 86
    .line 87
    invoke-direct {v10}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v11, Ljava/util/concurrent/ConcurrentHashMap;

    .line 91
    .line 92
    invoke-direct {v11}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v9, "auto.ui"

    .line 96
    .line 97
    move-object v5, p1

    .line 98
    move-object v3, p2

    .line 99
    move-object/from16 v6, p3

    .line 100
    .line 101
    invoke-direct/range {v0 .. v12}, Lio/sentry/protocol/z;-><init>(Ljava/lang/Double;Ljava/lang/Double;Lio/sentry/protocol/w;Lio/sentry/d7;Lio/sentry/d7;Ljava/lang/String;Ljava/lang/String;Lio/sentry/f7;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    .line 102
    .line 103
    .line 104
    return-object v0
.end method


# virtual methods
.method public final f(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final g(Lio/sentry/protocol/f0;Lio/sentry/i0;)Lio/sentry/protocol/f0;
    .locals 11

    .line 1
    iget-object p2, p0, Lio/sentry/android/core/f1;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/android/core/f1;->c:Lio/sentry/util/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    :try_start_1
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p1}, Lio/sentry/android/core/f1;->b(Lio/sentry/protocol/f0;)Z

    .line 23
    .line 24
    .line 25
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    iget-object v3, p1, Lio/sentry/protocol/f0;->e0:Ljava/util/HashMap;

    .line 27
    .line 28
    iget-object v4, p1, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 29
    .line 30
    if-eqz v2, :cond_d

    .line 31
    .line 32
    :try_start_2
    invoke-virtual {v4}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    const-string v7, "app.start"

    .line 41
    .line 42
    iget-object v8, v2, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    move v7, v6

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto/16 :goto_a

    .line 54
    .line 55
    :cond_1
    move v7, v5

    .line 56
    :goto_0
    if-eqz v2, :cond_2

    .line 57
    .line 58
    if-eqz v7, :cond_2

    .line 59
    .line 60
    iget-object v2, v2, Lio/sentry/b7;->U:Ljava/util/Map;

    .line 61
    .line 62
    const-string v7, "app.vitals.start.screen"

    .line 63
    .line 64
    invoke-interface {v2, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_2

    .line 69
    .line 70
    move v2, v6

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v2, v5

    .line 73
    :goto_1
    iget-boolean v7, v1, Lio/sentry/android/core/performance/g;->X:Z

    .line 74
    .line 75
    if-eqz v7, :cond_4

    .line 76
    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    iget-object v7, v1, Lio/sentry/android/core/performance/g;->b:Lio/sentry/util/g;

    .line 80
    .line 81
    invoke-virtual {v7}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_4

    .line 92
    .line 93
    :cond_3
    move v7, v6

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move v7, v5

    .line 96
    :goto_2
    if-eqz v7, :cond_a

    .line 97
    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    iget-object p2, v1, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 101
    .line 102
    invoke-virtual {p2}, Lio/sentry/android/core/performance/h;->d()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    invoke-virtual {p2}, Lio/sentry/android/core/performance/h;->e()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    iget-object p2, v1, Lio/sentry/android/core/performance/g;->e:Lio/sentry/android/core/performance/h;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    invoke-virtual {v1, p2}, Lio/sentry/android/core/performance/g;->b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    :goto_3
    invoke-virtual {p2}, Lio/sentry/android/core/performance/h;->a()J

    .line 123
    .line 124
    .line 125
    move-result-wide v7

    .line 126
    iget-object p2, v1, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 127
    .line 128
    iget-object p2, p2, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p2, Lio/sentry/util/a;

    .line 131
    .line 132
    invoke-virtual {p2}, Lio/sentry/util/a;->c()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, Lio/sentry/util/a;->close()V

    .line 136
    .line 137
    .line 138
    const-wide/16 v9, 0x0

    .line 139
    .line 140
    cmp-long p2, v7, v9

    .line 141
    .line 142
    if-eqz p2, :cond_7

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_7
    move v6, v5

    .line 146
    :goto_4
    if-eqz v6, :cond_a

    .line 147
    .line 148
    if-eqz v6, :cond_9

    .line 149
    .line 150
    new-instance p2, Lio/sentry/protocol/n;

    .line 151
    .line 152
    long-to-float v2, v7

    .line 153
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    sget-object v6, Lio/sentry/j2;->MILLISECOND:Lio/sentry/j2;

    .line 158
    .line 159
    invoke-virtual {v6}, Lio/sentry/j2;->apiName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-direct {p2, v6, v2}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    .line 164
    .line 165
    .line 166
    iget-object v2, v1, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 167
    .line 168
    sget-object v6, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    .line 169
    .line 170
    if-ne v2, v6, :cond_8

    .line 171
    .line 172
    const-string v2, "app_start_cold"

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_8
    const-string v2, "app_start_warm"

    .line 176
    .line 177
    :goto_5
    invoke-virtual {v3, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    :cond_9
    invoke-static {v1, p1}, Lio/sentry/android/core/f1;->a(Lio/sentry/android/core/performance/g;Lio/sentry/protocol/f0;)V

    .line 181
    .line 182
    .line 183
    iput-boolean v5, v1, Lio/sentry/android/core/performance/g;->X:Z

    .line 184
    .line 185
    iget-object p2, v1, Lio/sentry/android/core/performance/g;->i:Ljava/util/HashMap;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/util/HashMap;->clear()V

    .line 188
    .line 189
    .line 190
    iget-object p2, v1, Lio/sentry/android/core/performance/g;->v:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 193
    .line 194
    .line 195
    iget-object p2, v1, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 196
    .line 197
    iget-object p2, p2, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p2, Lio/sentry/util/a;

    .line 200
    .line 201
    invoke-virtual {p2}, Lio/sentry/util/a;->c()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Lio/sentry/util/a;->close()V

    .line 205
    .line 206
    .line 207
    :cond_a
    invoke-virtual {v4}, Lio/sentry/protocol/e;->d()Lio/sentry/protocol/a;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    if-nez p2, :cond_b

    .line 212
    .line 213
    new-instance p2, Lio/sentry/protocol/a;

    .line 214
    .line 215
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, p2}, Lio/sentry/protocol/e;->m(Lio/sentry/protocol/a;)V

    .line 219
    .line 220
    .line 221
    :cond_b
    iget-object v1, v1, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 222
    .line 223
    sget-object v2, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    .line 224
    .line 225
    if-ne v1, v2, :cond_c

    .line 226
    .line 227
    const-string v1, "cold"

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_c
    const-string v1, "warm"

    .line 231
    .line 232
    :goto_6
    iput-object v1, p2, Lio/sentry/protocol/a;->U:Ljava/lang/String;

    .line 233
    .line 234
    :cond_d
    invoke-static {p1}, Lio/sentry/android/core/f1;->d(Lio/sentry/protocol/f0;)V

    .line 235
    .line 236
    .line 237
    iget-object p2, p1, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 238
    .line 239
    invoke-virtual {v4}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-eqz p2, :cond_f

    .line 244
    .line 245
    if-eqz v1, :cond_f

    .line 246
    .line 247
    iget-object v1, v1, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 248
    .line 249
    const-string v2, "ui.load"

    .line 250
    .line 251
    invoke-virtual {v1, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_f

    .line 256
    .line 257
    iget-object p0, p0, Lio/sentry/android/core/f1;->a:Lio/sentry/android/core/d;

    .line 258
    .line 259
    iget-object v1, p0, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 262
    .line 263
    iget-object v2, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v2, Lio/sentry/util/a;

    .line 266
    .line 267
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 268
    .line 269
    .line 270
    :try_start_3
    invoke-virtual {p0}, Lio/sentry/android/core/d;->e()Z

    .line 271
    .line 272
    .line 273
    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 274
    if-nez p0, :cond_e

    .line 275
    .line 276
    :try_start_4
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 277
    .line 278
    .line 279
    const/4 p0, 0x0

    .line 280
    goto :goto_7

    .line 281
    :cond_e
    :try_start_5
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Ljava/util/Map;

    .line 286
    .line 287
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 288
    .line 289
    .line 290
    :try_start_6
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 291
    .line 292
    .line 293
    :goto_7
    if-eqz p0, :cond_f

    .line 294
    .line 295
    invoke-virtual {v3, p0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 296
    .line 297
    .line 298
    goto :goto_9

    .line 299
    :catchall_1
    move-exception p0

    .line 300
    :try_start_7
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :catchall_2
    move-exception p1

    .line 305
    :try_start_8
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    :goto_8
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 309
    :cond_f
    :goto_9
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 310
    .line 311
    .line 312
    return-object p1

    .line 313
    :goto_a
    :try_start_9
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 314
    .line 315
    .line 316
    goto :goto_b

    .line 317
    :catchall_3
    move-exception p1

    .line 318
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 319
    .line 320
    .line 321
    :goto_b
    throw p0
.end method
