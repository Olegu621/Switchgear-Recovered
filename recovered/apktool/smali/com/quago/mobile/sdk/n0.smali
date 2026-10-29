.class public final Lcom/quago/mobile/sdk/n0;
.super Landroid/os/Handler;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/quago/mobile/sdk/o0;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/quago/mobile/sdk/o0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Landroid/content/SharedPreferences;
    .locals 2

    .line 953
    iget-object p0, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget-object p0, p0, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 954
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_1

    return-object v0

    .line 955
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "Quago_temp_shared_preferences"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public final a(Lcom/quago/mobile/sdk/a1;)V
    .locals 13

    .line 956
    iget-object v0, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->k:Z

    const-string v2, "MaxSegment of %s reached!"

    const-string v3, "Handler"

    if-eqz v1, :cond_0

    .line 957
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    iget-object p1, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 958
    invoke-virtual {p1}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 959
    invoke-virtual {p0, v3, v2, p1}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 960
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 961
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    .line 962
    iget-object v0, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget v1, v0, Lcom/quago/mobile/sdk/o0;->h:I

    const/4 v4, 0x1

    add-int/2addr v1, v4

    iput v1, v0, Lcom/quago/mobile/sdk/o0;->h:I

    .line 963
    iget v1, v0, Lcom/quago/mobile/sdk/o0;->i:I

    add-int/2addr v1, v4

    iput v1, v0, Lcom/quago/mobile/sdk/o0;->i:I

    .line 964
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_3

    .line 965
    iget-object v0, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    move-result v0

    iget-object v1, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget v5, v1, Lcom/quago/mobile/sdk/o0;->h:I

    if-ge v0, v5, :cond_2

    .line 966
    iget-object p1, v1, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    if-eqz p1, :cond_1

    .line 967
    sget-object p1, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Ending last segment"

    invoke-virtual {p1, v3, v1, v0}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    iget-object p1, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget-object v6, p1, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 969
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    const/4 v11, 0x2

    const/4 v12, 0x2

    move-object v5, p0

    .line 970
    invoke-virtual/range {v5 .. v12}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    .line 971
    iget-object p0, v5, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    goto :goto_0

    :cond_1
    move-object v5, p0

    .line 972
    :goto_0
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    iget-object p1, v5, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget-object p1, p1, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 973
    invoke-virtual {p1}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 974
    invoke-virtual {p0, v3, v2, p1}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 975
    iget-object p0, v5, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iput-boolean v4, p0, Lcom/quago/mobile/sdk/o0;->k:Z

    return-void

    :cond_2
    move-object v5, p0

    .line 976
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 977
    iget-object v0, p1, Lcom/quago/mobile/sdk/a1;->a:Ljava/lang/String;

    .line 978
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v5, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget v1, v1, Lcom/quago/mobile/sdk/o0;->h:I

    .line 979
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v5, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 980
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 981
    const-string v1, "SegmentBegin Name = %s [%s/%s]"

    invoke-virtual {p0, v3, v1, v0}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    move-object v5, p0

    .line 982
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 983
    iget-object v0, p1, Lcom/quago/mobile/sdk/a1;->a:Ljava/lang/String;

    .line 984
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 985
    const-string v1, "SegmentBegin Name = %s"

    invoke-virtual {p0, v3, v1, v0}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 986
    :goto_1
    iget-object p0, v5, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget-object p0, p0, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    if-eqz p0, :cond_4

    const/4 v10, 0x1

    const/4 v11, 0x2

    move-object v4, v5

    move-object v5, p0

    .line 987
    invoke-virtual/range {v4 .. v11}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    move-object v5, v4

    .line 988
    :cond_4
    iput-wide v6, p1, Lcom/quago/mobile/sdk/a1;->d:J

    .line 989
    iput-wide v8, p1, Lcom/quago/mobile/sdk/a1;->f:J

    .line 990
    iget-object p0, v5, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget v0, p0, Lcom/quago/mobile/sdk/o0;->h:I

    iput v0, p1, Lcom/quago/mobile/sdk/a1;->l:I

    .line 991
    iget v0, p0, Lcom/quago/mobile/sdk/o0;->i:I

    iput v0, p1, Lcom/quago/mobile/sdk/a1;->m:I

    .line 992
    iput-object p1, p0, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    return-void
.end method

.method public final a(Lcom/quago/mobile/sdk/a1;JJII)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v7, 0x1

    .line 6
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v8

    .line 10
    move-wide/from16 v3, p2

    .line 11
    .line 12
    iput-wide v3, v2, Lcom/quago/mobile/sdk/a1;->e:J

    .line 13
    .line 14
    move-wide/from16 v5, p4

    .line 15
    .line 16
    iput-wide v5, v2, Lcom/quago/mobile/sdk/a1;->g:J

    .line 17
    .line 18
    iget-object v1, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 19
    .line 20
    iget-object v1, v1, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 21
    .line 22
    iget-wide v3, v2, Lcom/quago/mobile/sdk/a1;->f:J

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v6}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/a1;JJ)Lcom/quago/mobile/sdk/l;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 29
    .line 30
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getAppToken()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 39
    .line 40
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->g:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v4, v1, Lcom/quago/mobile/sdk/l;->h:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->y:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v4, v1, Lcom/quago/mobile/sdk/l;->i:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->z:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v4, v1, Lcom/quago/mobile/sdk/l;->j:Ljava/lang/String;

    .line 51
    .line 52
    iget-wide v3, v3, Lcom/quago/mobile/sdk/o0;->A:J

    .line 53
    .line 54
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->k:Ljava/lang/String;

    .line 59
    .line 60
    const-string v3, "1.15.0"

    .line 61
    .line 62
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->l:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 65
    .line 66
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 67
    .line 68
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getWrapper()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    iput v3, v1, Lcom/quago/mobile/sdk/l;->d:I

    .line 73
    .line 74
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 75
    .line 76
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 77
    .line 78
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getWrapperVersion()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->e:Ljava/lang/String;

    .line 83
    .line 84
    move/from16 v3, p6

    .line 85
    .line 86
    iput v3, v1, Lcom/quago/mobile/sdk/l;->A:I

    .line 87
    .line 88
    move/from16 v3, p7

    .line 89
    .line 90
    iput v3, v1, Lcom/quago/mobile/sdk/l;->o:I

    .line 91
    .line 92
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 93
    .line 94
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 95
    .line 96
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getFlavor()Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget v3, v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->value:I

    .line 101
    .line 102
    iput v3, v1, Lcom/quago/mobile/sdk/l;->p:I

    .line 103
    .line 104
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 105
    .line 106
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->F:[Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 107
    .line 108
    const/16 v4, 0x9

    .line 109
    .line 110
    const/16 v9, 0x8

    .line 111
    .line 112
    const/4 v10, 0x6

    .line 113
    const/4 v11, 0x5

    .line 114
    const/4 v12, 0x4

    .line 115
    const/4 v13, 0x2

    .line 116
    const/4 v14, 0x0

    .line 117
    if-eqz v3, :cond_1

    .line 118
    .line 119
    const/16 v15, 0xa

    .line 120
    .line 121
    new-array v15, v15, [Z

    .line 122
    .line 123
    const/16 p2, 0x7

    .line 124
    .line 125
    array-length v5, v3

    .line 126
    move v6, v14

    .line 127
    const/16 p3, 0x3

    .line 128
    .line 129
    :goto_0
    if-ge v6, v5, :cond_0

    .line 130
    .line 131
    aget-object v16, v3, v6

    .line 132
    .line 133
    sget-object v17, Lcom/quago/mobile/sdk/m0;->a:[I

    .line 134
    .line 135
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    .line 136
    .line 137
    .line 138
    move-result v16

    .line 139
    aget v16, v17, v16

    .line 140
    .line 141
    packed-switch v16, :pswitch_data_0

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_0
    aput-boolean v7, v15, v14

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :pswitch_1
    aput-boolean v7, v15, v7

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :pswitch_2
    aput-boolean v7, v15, v13

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_3
    aput-boolean v7, v15, p3

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :pswitch_4
    aput-boolean v7, v15, v12

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :pswitch_5
    aput-boolean v7, v15, v11

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_6
    aput-boolean v7, v15, v10

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :pswitch_7
    aput-boolean v7, v15, p2

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :pswitch_8
    aput-boolean v7, v15, v9

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :pswitch_9
    aput-boolean v7, v15, v4

    .line 173
    .line 174
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_0
    invoke-static {v15}, Lcom/quago/mobile/sdk/g;->a([Z)J

    .line 178
    .line 179
    .line 180
    move-result-wide v5

    .line 181
    iput-wide v5, v1, Lcom/quago/mobile/sdk/l;->q:J

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_1
    const/16 p2, 0x7

    .line 185
    .line 186
    const/16 p3, 0x3

    .line 187
    .line 188
    :goto_2
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 189
    .line 190
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->q:Lcom/quago/mobile/sdk/e;

    .line 191
    .line 192
    if-eqz v3, :cond_c

    .line 193
    .line 194
    iget-object v3, v3, Lcom/quago/mobile/sdk/e;->d:Ljava/util/List;

    .line 195
    .line 196
    if-eqz v3, :cond_c

    .line 197
    .line 198
    new-array v4, v4, [Z

    .line 199
    .line 200
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-eqz v5, :cond_b

    .line 209
    .line 210
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, Landroid/hardware/Sensor;

    .line 215
    .line 216
    invoke-virtual {v5}, Landroid/hardware/Sensor;->getType()I

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-eq v5, v7, :cond_a

    .line 221
    .line 222
    if-eq v5, v13, :cond_9

    .line 223
    .line 224
    if-eq v5, v9, :cond_8

    .line 225
    .line 226
    const/16 v6, 0xd

    .line 227
    .line 228
    if-eq v5, v6, :cond_7

    .line 229
    .line 230
    const/16 v6, 0x12

    .line 231
    .line 232
    if-eq v5, v6, :cond_6

    .line 233
    .line 234
    const/16 v6, 0x14

    .line 235
    .line 236
    if-eq v5, v6, :cond_5

    .line 237
    .line 238
    if-eq v5, v12, :cond_4

    .line 239
    .line 240
    if-eq v5, v11, :cond_3

    .line 241
    .line 242
    if-eq v5, v10, :cond_2

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_2
    aput-boolean v7, v4, v12

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_3
    aput-boolean v7, v4, v11

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_4
    aput-boolean v7, v4, v10

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_5
    aput-boolean v7, v4, v14

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_6
    aput-boolean v7, v4, v13

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_7
    aput-boolean v7, v4, v7

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_8
    aput-boolean v7, v4, p3

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_9
    aput-boolean v7, v4, p2

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_a
    aput-boolean v7, v4, v9

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_b
    invoke-static {v4}, Lcom/quago/mobile/sdk/g;->a([Z)J

    .line 273
    .line 274
    .line 275
    move-result-wide v3

    .line 276
    iput-wide v3, v1, Lcom/quago/mobile/sdk/l;->r:J

    .line 277
    .line 278
    :cond_c
    iget-object v3, v2, Lcom/quago/mobile/sdk/a1;->a:Ljava/lang/String;

    .line 279
    .line 280
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->f:Ljava/lang/String;

    .line 281
    .line 282
    iget-object v3, v2, Lcom/quago/mobile/sdk/a1;->b:Ljava/lang/String;

    .line 283
    .line 284
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->g:Ljava/lang/String;

    .line 285
    .line 286
    iget-object v3, v2, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 287
    .line 288
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->b:Ljava/lang/String;

    .line 289
    .line 290
    iget-object v3, v2, Lcom/quago/mobile/sdk/a1;->k:Ljava/lang/String;

    .line 291
    .line 292
    if-nez v3, :cond_d

    .line 293
    .line 294
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 295
    .line 296
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 297
    .line 298
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getDefaultAdditionalId()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->c:Ljava/lang/String;

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_d
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->c:Ljava/lang/String;

    .line 306
    .line 307
    :goto_4
    iget v3, v2, Lcom/quago/mobile/sdk/a1;->l:I

    .line 308
    .line 309
    iput v3, v1, Lcom/quago/mobile/sdk/l;->m:I

    .line 310
    .line 311
    iget v3, v2, Lcom/quago/mobile/sdk/a1;->m:I

    .line 312
    .line 313
    iput v3, v1, Lcom/quago/mobile/sdk/l;->n:I

    .line 314
    .line 315
    new-instance v3, Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 318
    .line 319
    .line 320
    iput-object v3, v1, Lcom/quago/mobile/sdk/l;->z:Ljava/util/ArrayList;

    .line 321
    .line 322
    iget-object v3, v2, Lcom/quago/mobile/sdk/a1;->c:Ljava/util/HashMap;

    .line 323
    .line 324
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_e

    .line 337
    .line 338
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    check-cast v4, Ljava/util/Map$Entry;

    .line 343
    .line 344
    iget-object v5, v1, Lcom/quago/mobile/sdk/l;->z:Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    check-cast v6, Ljava/lang/String;

    .line 351
    .line 352
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    check-cast v4, Ljava/lang/String;

    .line 357
    .line 358
    filled-new-array {v6, v4}, [Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_e
    new-instance v15, Lcom/quago/mobile/sdk/h1;

    .line 367
    .line 368
    iget-wide v3, v2, Lcom/quago/mobile/sdk/a1;->d:J

    .line 369
    .line 370
    iget-wide v5, v2, Lcom/quago/mobile/sdk/a1;->e:J

    .line 371
    .line 372
    iget-wide v9, v2, Lcom/quago/mobile/sdk/a1;->f:J

    .line 373
    .line 374
    iget-object v11, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 375
    .line 376
    iget-wide v13, v11, Lcom/quago/mobile/sdk/o0;->B:J

    .line 377
    .line 378
    sub-long v20, v9, v13

    .line 379
    .line 380
    iget-wide v9, v2, Lcom/quago/mobile/sdk/a1;->g:J

    .line 381
    .line 382
    sub-long v22, v9, v13

    .line 383
    .line 384
    iget-wide v9, v11, Lcom/quago/mobile/sdk/o0;->C:J

    .line 385
    .line 386
    move-wide/from16 v16, v3

    .line 387
    .line 388
    move-wide/from16 v18, v5

    .line 389
    .line 390
    move-wide/from16 v24, v9

    .line 391
    .line 392
    invoke-direct/range {v15 .. v25}, Lcom/quago/mobile/sdk/h1;-><init>(JJJJJ)V

    .line 393
    .line 394
    .line 395
    iput-object v15, v1, Lcom/quago/mobile/sdk/l;->t:Lcom/quago/mobile/sdk/h1;

    .line 396
    .line 397
    iget-object v3, v2, Lcom/quago/mobile/sdk/a1;->i:Lcom/quago/mobile/sdk/g1;

    .line 398
    .line 399
    if-eqz v3, :cond_f

    .line 400
    .line 401
    new-instance v4, Lcom/quago/mobile/sdk/a;

    .line 402
    .line 403
    iget v5, v3, Lcom/quago/mobile/sdk/g1;->f:F

    .line 404
    .line 405
    iget v6, v3, Lcom/quago/mobile/sdk/g1;->g:F

    .line 406
    .line 407
    invoke-direct {v4, v5, v6}, Lcom/quago/mobile/sdk/a;-><init>(FF)V

    .line 408
    .line 409
    .line 410
    iput-object v4, v1, Lcom/quago/mobile/sdk/l;->y:Lcom/quago/mobile/sdk/a;

    .line 411
    .line 412
    iget v4, v3, Lcom/quago/mobile/sdk/g1;->b:I

    .line 413
    .line 414
    iput v4, v1, Lcom/quago/mobile/sdk/l;->u:I

    .line 415
    .line 416
    iget v4, v3, Lcom/quago/mobile/sdk/g1;->c:I

    .line 417
    .line 418
    iput v4, v1, Lcom/quago/mobile/sdk/l;->v:I

    .line 419
    .line 420
    iget v4, v3, Lcom/quago/mobile/sdk/g1;->d:I

    .line 421
    .line 422
    iput v4, v1, Lcom/quago/mobile/sdk/l;->w:I

    .line 423
    .line 424
    iget v3, v3, Lcom/quago/mobile/sdk/g1;->e:I

    .line 425
    .line 426
    iput v3, v1, Lcom/quago/mobile/sdk/l;->x:I

    .line 427
    .line 428
    :cond_f
    iget-boolean v3, v11, Lcom/quago/mobile/sdk/o0;->m:Z

    .line 429
    .line 430
    iput-boolean v3, v1, Lcom/quago/mobile/sdk/l;->B:Z

    .line 431
    .line 432
    iget-object v3, v11, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 433
    .line 434
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getCallback()Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    if-eqz v3, :cond_10

    .line 439
    .line 440
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    .line 441
    .line 442
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 443
    .line 444
    .line 445
    const-string v3, "app_token"

    .line 446
    .line 447
    iget-object v4, v1, Lcom/quago/mobile/sdk/l;->a:Ljava/lang/String;

    .line 448
    .line 449
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    const-string v3, "platform"

    .line 453
    .line 454
    invoke-virtual {v2, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    const-string v3, "seg_name"

    .line 458
    .line 459
    iget-object v4, v1, Lcom/quago/mobile/sdk/l;->f:Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    const-string v3, "seg_count"

    .line 465
    .line 466
    iget v4, v1, Lcom/quago/mobile/sdk/l;->m:I

    .line 467
    .line 468
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    const-string v3, "user_seg_count"

    .line 476
    .line 477
    iget v4, v1, Lcom/quago/mobile/sdk/l;->n:I

    .line 478
    .line 479
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    const-string v3, "user_id"

    .line 487
    .line 488
    iget-object v4, v1, Lcom/quago/mobile/sdk/l;->b:Ljava/lang/String;

    .line 489
    .line 490
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    const-string v3, "additional_id"

    .line 494
    .line 495
    iget-object v4, v1, Lcom/quago/mobile/sdk/l;->c:Ljava/lang/String;

    .line 496
    .line 497
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    const-string v3, "sdk_version_name"

    .line 501
    .line 502
    iget-object v4, v1, Lcom/quago/mobile/sdk/l;->l:Ljava/lang/String;

    .line 503
    .line 504
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    const-string v3, "mode"

    .line 508
    .line 509
    iget v4, v1, Lcom/quago/mobile/sdk/l;->o:I

    .line 510
    .line 511
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 519
    .line 520
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 521
    .line 522
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getCallback()Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    iget-object v4, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 527
    .line 528
    iget-object v4, v4, Lcom/quago/mobile/sdk/o0;->e:Lcom/quago/mobile/sdk/b1;

    .line 529
    .line 530
    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 531
    :try_start_1
    invoke-virtual {v4, v2}, Lcom/quago/mobile/sdk/b1;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 535
    :try_start_2
    monitor-exit v4

    .line 536
    iget-object v0, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 537
    .line 538
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->e:Lcom/quago/mobile/sdk/b1;

    .line 539
    .line 540
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/l;->a()Ljava/util/TreeMap;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v0, v1}, Lcom/quago/mobile/sdk/b1;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-interface {v3, v2, v0}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;->onJsonSegment(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    return-void

    .line 552
    :catchall_0
    move-exception v0

    .line 553
    monitor-exit v4

    .line 554
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 555
    :catch_0
    move-exception v0

    .line 556
    sget-object v1, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 557
    .line 558
    const-string v2, "handleSegmentChange_json_sendoff"

    .line 559
    .line 560
    invoke-virtual {v1, v2, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 561
    .line 562
    .line 563
    return-void

    .line 564
    :cond_10
    :try_start_3
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 565
    .line 566
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->t:Lcom/quago/mobile/sdk/s0;

    .line 567
    .line 568
    if-nez v3, :cond_11

    .line 569
    .line 570
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 571
    .line 572
    const-string v1, "handleSegmentChange_server_sendoff"

    .line 573
    .line 574
    const-string v2, "quagoNetworkModule is null"

    .line 575
    .line 576
    const/4 v3, 0x0

    .line 577
    new-array v3, v3, [Ljava/lang/Object;

    .line 578
    .line 579
    invoke-virtual {v0, v1, v2, v3}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :cond_11
    new-instance v3, Ljava/util/HashMap;

    .line 584
    .line 585
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 586
    .line 587
    .line 588
    const-string v4, "app_token"

    .line 589
    .line 590
    iget-object v5, v1, Lcom/quago/mobile/sdk/l;->a:Ljava/lang/String;

    .line 591
    .line 592
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    const-string v4, "env"

    .line 596
    .line 597
    iget v5, v1, Lcom/quago/mobile/sdk/l;->p:I

    .line 598
    .line 599
    sget-object v6, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->PRODUCTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 600
    .line 601
    iget v6, v6, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->value:I

    .line 602
    .line 603
    if-ne v5, v6, :cond_12

    .line 604
    .line 605
    const-string v5, "prod"

    .line 606
    .line 607
    goto :goto_6

    .line 608
    :cond_12
    const-string v5, "stage"

    .line 609
    .line 610
    :goto_6
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    const-string v4, "sdk_version"

    .line 614
    .line 615
    iget-object v5, v1, Lcom/quago/mobile/sdk/l;->l:Ljava/lang/String;

    .line 616
    .line 617
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    const-string v4, "payload"

    .line 621
    .line 622
    iget-object v5, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 623
    .line 624
    iget-object v5, v5, Lcom/quago/mobile/sdk/o0;->e:Lcom/quago/mobile/sdk/b1;

    .line 625
    .line 626
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/l;->a()Ljava/util/TreeMap;

    .line 627
    .line 628
    .line 629
    move-result-object v6

    .line 630
    invoke-virtual {v5, v6}, Lcom/quago/mobile/sdk/b1;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    .line 635
    .line 636
    .line 637
    move-result-object v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 638
    :try_start_4
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    .line 639
    .line 640
    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 641
    .line 642
    .line 643
    new-instance v9, Ljava/util/zip/GZIPOutputStream;

    .line 644
    .line 645
    invoke-direct {v9, v6}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v9, v5}, Ljava/io/OutputStream;->write([B)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 655
    .line 656
    .line 657
    move-result-object v5
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 658
    const/4 v6, 0x0

    .line 659
    :try_start_5
    invoke-static {v5, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v5

    .line 663
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    iget-object v4, v1, Lcom/quago/mobile/sdk/l;->D:Ljava/util/LinkedList;

    .line 667
    .line 668
    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    const-wide/16 v5, 0x3e8

    .line 673
    .line 674
    const/4 v9, 0x2

    .line 675
    if-lt v4, v9, :cond_13

    .line 676
    .line 677
    iget-object v9, v1, Lcom/quago/mobile/sdk/l;->D:Ljava/util/LinkedList;

    .line 678
    .line 679
    add-int/lit8 v10, v4, -0x1

    .line 680
    .line 681
    invoke-virtual {v9, v10}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v9

    .line 685
    check-cast v9, [Ljava/lang/Double;

    .line 686
    .line 687
    const/4 v10, 0x0

    .line 688
    aget-object v9, v9, v10

    .line 689
    .line 690
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 691
    .line 692
    .line 693
    move-result-wide v11

    .line 694
    iget-object v9, v1, Lcom/quago/mobile/sdk/l;->D:Ljava/util/LinkedList;

    .line 695
    .line 696
    invoke-virtual {v9, v10}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v9

    .line 700
    check-cast v9, [Ljava/lang/Double;

    .line 701
    .line 702
    aget-object v9, v9, v10

    .line 703
    .line 704
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 705
    .line 706
    .line 707
    move-result-wide v9

    .line 708
    sub-double/2addr v11, v9

    .line 709
    double-to-long v9, v11

    .line 710
    div-long/2addr v9, v5

    .line 711
    goto :goto_7

    .line 712
    :cond_13
    const-wide/16 v9, 0x0

    .line 713
    .line 714
    :goto_7
    iget-object v11, v1, Lcom/quago/mobile/sdk/l;->t:Lcom/quago/mobile/sdk/h1;

    .line 715
    .line 716
    iget-wide v12, v11, Lcom/quago/mobile/sdk/h1;->d:J

    .line 717
    .line 718
    iget-wide v14, v11, Lcom/quago/mobile/sdk/h1;->c:J

    .line 719
    .line 720
    sub-long/2addr v12, v14

    .line 721
    div-long/2addr v12, v5

    .line 722
    const-string v5, "platform"

    .line 723
    .line 724
    invoke-virtual {v3, v5, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    const-string v5, "user_id"

    .line 728
    .line 729
    iget-object v6, v1, Lcom/quago/mobile/sdk/l;->b:Ljava/lang/String;

    .line 730
    .line 731
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    const-string v5, "device_id"

    .line 735
    .line 736
    iget-object v6, v1, Lcom/quago/mobile/sdk/l;->s:Lcom/quago/mobile/sdk/p0;

    .line 737
    .line 738
    iget-object v6, v6, Lcom/quago/mobile/sdk/p0;->c:Lcom/quago/mobile/sdk/z0;

    .line 739
    .line 740
    iget-object v6, v6, Lcom/quago/mobile/sdk/z0;->a:Ljava/lang/String;

    .line 741
    .line 742
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    const-string v5, "session_id"

    .line 746
    .line 747
    iget-object v6, v1, Lcom/quago/mobile/sdk/l;->h:Ljava/lang/String;

    .line 748
    .line 749
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    const-string v5, "seg_count"

    .line 753
    .line 754
    iget v6, v1, Lcom/quago/mobile/sdk/l;->m:I

    .line 755
    .line 756
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 757
    .line 758
    .line 759
    move-result-object v6

    .line 760
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    const-string v5, "user_seg_count"

    .line 764
    .line 765
    iget v6, v1, Lcom/quago/mobile/sdk/l;->n:I

    .line 766
    .line 767
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 768
    .line 769
    .line 770
    move-result-object v6

    .line 771
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    const-string v5, "app_version"

    .line 775
    .line 776
    iget-object v6, v1, Lcom/quago/mobile/sdk/l;->j:Ljava/lang/String;

    .line 777
    .line 778
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    const-string v5, "seg_name"

    .line 782
    .line 783
    iget-object v6, v1, Lcom/quago/mobile/sdk/l;->f:Ljava/lang/String;

    .line 784
    .line 785
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    const-string v5, "seg_duration"

    .line 789
    .line 790
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 791
    .line 792
    .line 793
    move-result-object v6

    .line 794
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    const-string v5, "cnt_motion"

    .line 798
    .line 799
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 800
    .line 801
    .line 802
    move-result-object v4

    .line 803
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    const-string v4, "motion_duration"

    .line 807
    .line 808
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 809
    .line 810
    .line 811
    move-result-object v5

    .line 812
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    const-string v4, "model"

    .line 816
    .line 817
    iget-object v5, v1, Lcom/quago/mobile/sdk/l;->s:Lcom/quago/mobile/sdk/p0;

    .line 818
    .line 819
    iget-object v5, v5, Lcom/quago/mobile/sdk/p0;->a:Lcom/quago/mobile/sdk/d0;

    .line 820
    .line 821
    iget-object v5, v5, Lcom/quago/mobile/sdk/d0;->m:Ljava/lang/String;

    .line 822
    .line 823
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    const-string v4, "is_new"

    .line 827
    .line 828
    iget-boolean v5, v1, Lcom/quago/mobile/sdk/l;->B:Z

    .line 829
    .line 830
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 831
    .line 832
    .line 833
    move-result-object v5

    .line 834
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    iget-object v4, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 838
    .line 839
    iget-object v4, v4, Lcom/quago/mobile/sdk/o0;->e:Lcom/quago/mobile/sdk/b1;

    .line 840
    .line 841
    invoke-virtual {v4, v3}, Lcom/quago/mobile/sdk/b1;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v10

    .line 845
    iget-boolean v2, v2, Lcom/quago/mobile/sdk/a1;->n:Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 846
    .line 847
    iget-object v3, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 848
    .line 849
    if-eqz v2, :cond_15

    .line 850
    .line 851
    :try_start_6
    iget-object v2, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 852
    .line 853
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getTokenCallback()Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    if-eqz v2, :cond_14

    .line 858
    .line 859
    const-string v2, "INIT"

    .line 860
    .line 861
    iget-object v3, v1, Lcom/quago/mobile/sdk/l;->f:Ljava/lang/String;

    .line 862
    .line 863
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    if-eqz v2, :cond_14

    .line 868
    .line 869
    iget-object v0, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 870
    .line 871
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->t:Lcom/quago/mobile/sdk/s0;

    .line 872
    .line 873
    iget-object v11, v1, Lcom/quago/mobile/sdk/l;->h:Ljava/lang/String;

    .line 874
    .line 875
    iget-object v12, v1, Lcom/quago/mobile/sdk/l;->f:Ljava/lang/String;

    .line 876
    .line 877
    iget-object v13, v1, Lcom/quago/mobile/sdk/l;->g:Ljava/lang/String;

    .line 878
    .line 879
    new-instance v8, Lcom/quago/mobile/sdk/v0;

    .line 880
    .line 881
    iget-object v9, v0, Lcom/quago/mobile/sdk/s0;->b:Lcom/quago/mobile/sdk/x0;

    .line 882
    .line 883
    invoke-direct/range {v8 .. v13}, Lcom/quago/mobile/sdk/v0;-><init>(Lcom/quago/mobile/sdk/x0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    iget-object v0, v0, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 887
    .line 888
    invoke-static {v0, v7, v8}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 893
    .line 894
    .line 895
    return-void

    .line 896
    :cond_14
    iget-object v0, v0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 897
    .line 898
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->t:Lcom/quago/mobile/sdk/s0;

    .line 899
    .line 900
    new-instance v1, Lcom/quago/mobile/sdk/u0;

    .line 901
    .line 902
    iget-object v2, v0, Lcom/quago/mobile/sdk/s0;->b:Lcom/quago/mobile/sdk/x0;

    .line 903
    .line 904
    invoke-direct {v1, v2, v10, v7}, Lcom/quago/mobile/sdk/u0;-><init>(Lcom/quago/mobile/sdk/x0;Ljava/lang/String;Z)V

    .line 905
    .line 906
    .line 907
    iget-object v0, v0, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 908
    .line 909
    invoke-static {v0, v7, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 914
    .line 915
    .line 916
    return-void

    .line 917
    :cond_15
    iget-object v0, v3, Lcom/quago/mobile/sdk/o0;->t:Lcom/quago/mobile/sdk/s0;

    .line 918
    .line 919
    new-instance v1, Lcom/quago/mobile/sdk/u0;

    .line 920
    .line 921
    iget-object v2, v0, Lcom/quago/mobile/sdk/s0;->b:Lcom/quago/mobile/sdk/x0;

    .line 922
    .line 923
    const/4 v3, 0x0

    .line 924
    invoke-direct {v1, v2, v10, v3}, Lcom/quago/mobile/sdk/u0;-><init>(Lcom/quago/mobile/sdk/x0;Ljava/lang/String;Z)V

    .line 925
    .line 926
    .line 927
    iget-object v0, v0, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 928
    .line 929
    invoke-static {v0, v7, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 934
    .line 935
    .line 936
    return-void

    .line 937
    :catch_1
    move-exception v0

    .line 938
    new-instance v1, Ljava/lang/RuntimeException;

    .line 939
    .line 940
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 941
    .line 942
    .line 943
    throw v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 944
    :catch_2
    move-exception v0

    .line 945
    sget-object v1, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 946
    .line 947
    const-string v2, "handleSegmentChange_server_sendoff"

    .line 948
    .line 949
    invoke-virtual {v1, v2, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 950
    .line 951
    .line 952
    return-void

    .line 953
    :pswitch_data_0
    .packed-switch 0x1
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

.method public final b()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 4
    .line 5
    const-string v2, "Handler"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    new-array v0, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "EndSegment called without an active segment."

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1, v0}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, -0x1

    .line 27
    if-le v0, v1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 38
    .line 39
    iget-object v1, v1, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 40
    .line 41
    iget v1, v1, Lcom/quago/mobile/sdk/a1;->l:I

    .line 42
    .line 43
    if-gt v0, v1, :cond_1

    .line 44
    .line 45
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 46
    .line 47
    new-array v1, v3, [Ljava/lang/Object;

    .line 48
    .line 49
    const-string v3, "Ending last segment"

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x2

    .line 55
    :goto_0
    move v7, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 58
    .line 59
    new-array v1, v3, [Ljava/lang/Object;

    .line 60
    .line 61
    const-string v3, "Segment ended."

    .line 62
    .line 63
    invoke-virtual {v0, v2, v3, v1}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    goto :goto_0

    .line 68
    :goto_1
    iget-object v0, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 69
    .line 70
    iget-object v2, v0, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    const/4 v8, 0x2

    .line 81
    move-object v1, p0

    .line 82
    invoke-virtual/range {v1 .. v8}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    .line 83
    .line 84
    .line 85
    iget-object p0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 89
    .line 90
    return-void
.end method

.method public final b(Lcom/quago/mobile/sdk/a1;)V
    .locals 8

    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 92
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    .line 93
    iget-object v0, p0, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    iget-wide v6, v0, Lcom/quago/mobile/sdk/o0;->b:J

    iget-wide v0, v0, Lcom/quago/mobile/sdk/o0;->c:J

    .line 94
    iput-wide v6, p1, Lcom/quago/mobile/sdk/a1;->d:J

    .line 95
    iput-wide v0, p1, Lcom/quago/mobile/sdk/a1;->f:J

    .line 96
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v6, "Handler"

    const-string v7, "handle TOUCH Segment"

    invoke-virtual {v0, v6, v7, v1}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v6, 0x1

    const/4 v7, 0x2

    move-object v0, p0

    move-object v1, p1

    .line 97
    invoke-virtual/range {v0 .. v7}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "Handler-root"

    .line 6
    .line 7
    const-string v3, "image_checked"

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const-string v10, "Handler"

    .line 15
    .line 16
    :try_start_0
    iget-object v5, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 17
    .line 18
    if-eqz v5, :cond_32

    .line 19
    .line 20
    iget-boolean v6, v5, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 21
    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    goto/16 :goto_19

    .line 25
    .line 26
    :cond_0
    iget-object v6, v5, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 27
    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 31
    .line 32
    const-string v1, "Settings is null"

    .line 33
    .line 34
    new-array v2, v9, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v0, v10, v1, v2}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception v0

    .line 41
    goto/16 :goto_18

    .line 42
    .line 43
    :cond_1
    iget v7, v0, Landroid/os/Message;->what:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    const/16 v8, 0x10

    .line 46
    .line 47
    const-string v11, "touch_checked"

    .line 48
    .line 49
    const/4 v12, 0x1

    .line 50
    if-eq v7, v12, :cond_2d

    .line 51
    .line 52
    const/4 v2, -0x1

    .line 53
    const-string v13, "handle USERID Segment for UserId = %s"

    .line 54
    .line 55
    const/16 v14, 0x8

    .line 56
    .line 57
    const/4 v15, 0x0

    .line 58
    packed-switch v7, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_19

    .line 62
    .line 63
    :pswitch_0
    :try_start_1
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 64
    .line 65
    const-string v2, "TOUCH_CHECK"

    .line 66
    .line 67
    new-array v3, v9, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 73
    .line 74
    iget-wide v2, v0, Lcom/quago/mobile/sdk/o0;->c:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 75
    .line 76
    const-wide/16 v4, 0x0

    .line 77
    .line 78
    cmp-long v2, v2, v4

    .line 79
    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    :try_start_2
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/n0;->a()Landroid/content/SharedPreferences;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {v0, v11, v12}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catch_1
    move-exception v0

    .line 101
    :try_start_3
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 102
    .line 103
    invoke-virtual {v2, v10, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_0
    new-instance v3, Lcom/quago/mobile/sdk/a1;

    .line 107
    .line 108
    const-string v4, "TOUCH"

    .line 109
    .line 110
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 111
    .line 112
    iget-object v5, v0, Lcom/quago/mobile/sdk/o0;->G:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 121
    .line 122
    iget-object v7, v0, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 123
    .line 124
    new-instance v8, Lcom/quago/mobile/sdk/g1;

    .line 125
    .line 126
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 127
    .line 128
    invoke-direct {v8, v0}, Lcom/quago/mobile/sdk/g1;-><init>(Lcom/quago/mobile/sdk/g1;)V

    .line 129
    .line 130
    .line 131
    invoke-direct/range {v3 .. v8}, Lcom/quago/mobile/sdk/a1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/quago/mobile/sdk/p0;Lcom/quago/mobile/sdk/g1;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v3}, Lcom/quago/mobile/sdk/n0;->b(Lcom/quago/mobile/sdk/a1;)V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_19

    .line 138
    .line 139
    :cond_3
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getTouchSegmentDurationMillis()J

    .line 142
    .line 143
    .line 144
    move-result-wide v2

    .line 145
    invoke-virtual {v1, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 146
    .line 147
    .line 148
    goto/16 :goto_19

    .line 149
    .line 150
    :pswitch_1
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 151
    .line 152
    const-string v3, "CHANGE_APP_TOKEN"

    .line 153
    .line 154
    new-array v5, v9, [Ljava/lang/Object;

    .line 155
    .line 156
    invoke-virtual {v2, v10, v3, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 160
    .line 161
    instance-of v3, v0, Ljava/lang/String;

    .line 162
    .line 163
    if-nez v3, :cond_4

    .line 164
    .line 165
    const-string v0, "newAppToken object must be String"

    .line 166
    .line 167
    new-array v1, v9, [Ljava/lang/Object;

    .line 168
    .line 169
    invoke-virtual {v2, v10, v0, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_4
    check-cast v0, Ljava/lang/String;

    .line 174
    .line 175
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 176
    .line 177
    iget-object v5, v3, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 178
    .line 179
    if-eqz v5, :cond_5

    .line 180
    .line 181
    move v5, v12

    .line 182
    goto :goto_1

    .line 183
    :cond_5
    move v5, v9

    .line 184
    :goto_1
    iget-object v6, v3, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 185
    .line 186
    if-eqz v6, :cond_6

    .line 187
    .line 188
    move v6, v12

    .line 189
    goto :goto_2

    .line 190
    :cond_6
    move v6, v9

    .line 191
    :goto_2
    if-nez v5, :cond_8

    .line 192
    .line 193
    if-eqz v6, :cond_7

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_7
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 197
    .line 198
    invoke-virtual {v3, v0}, Lcom/quago/mobile/sdk/QuagoSettings;->setAppToken(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-string v0, "AppToken is now changed to = %s"

    .line 202
    .line 203
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 204
    .line 205
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 206
    .line 207
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getAppToken()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v2, v10, v0, v3}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 219
    .line 220
    iput v9, v0, Lcom/quago/mobile/sdk/o0;->h:I

    .line 221
    .line 222
    const-string v0, "segmentCounter reset to = %d"

    .line 223
    .line 224
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v2, v10, v0, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 232
    .line 233
    iput v9, v0, Lcom/quago/mobile/sdk/o0;->j:I

    .line 234
    .line 235
    const-string v0, "userSegmentCounterA reset to = %d"

    .line 236
    .line 237
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v2, v10, v0, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 245
    .line 246
    iput v9, v0, Lcom/quago/mobile/sdk/o0;->i:I

    .line 247
    .line 248
    const-string v0, "userSegmentCounterM reset to = %d"

    .line 249
    .line 250
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-virtual {v2, v10, v0, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 258
    .line 259
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 260
    .line 261
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->isInitSegmentDisabled()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-nez v0, :cond_32

    .line 266
    .line 267
    new-instance v0, Lcom/quago/mobile/sdk/a1;

    .line 268
    .line 269
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 270
    .line 271
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 272
    .line 273
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 278
    .line 279
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 280
    .line 281
    new-instance v5, Lcom/quago/mobile/sdk/g1;

    .line 282
    .line 283
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 284
    .line 285
    invoke-direct {v5, v3}, Lcom/quago/mobile/sdk/g1;-><init>(Lcom/quago/mobile/sdk/g1;)V

    .line 286
    .line 287
    .line 288
    invoke-direct {v0, v2, v4, v5}, Lcom/quago/mobile/sdk/a1;-><init>(Ljava/lang/String;Lcom/quago/mobile/sdk/p0;Lcom/quago/mobile/sdk/g1;)V

    .line 289
    .line 290
    .line 291
    iput-boolean v12, v0, Lcom/quago/mobile/sdk/a1;->n:Z

    .line 292
    .line 293
    invoke-virtual {v1, v0}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/n0;->b()V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :cond_8
    :goto_3
    const-string v1, "changeAppToken() to = %s, ignored due to having an active Segment,\nplease call endTracking()/endSegment() before trying to change AppToken."

    .line 301
    .line 302
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v2, v10, v1, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :pswitch_2
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, Lcom/quago/mobile/sdk/a1;

    .line 313
    .line 314
    invoke-virtual {v1, v0}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 315
    .line 316
    .line 317
    :try_start_4
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/n0;->a()Landroid/content/SharedPreferences;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    if-eqz v2, :cond_b

    .line 322
    .line 323
    invoke-interface {v2, v3, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_9

    .line 328
    .line 329
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 330
    .line 331
    const-string v2, "Emu was already checked."

    .line 332
    .line 333
    new-array v3, v9, [Ljava/lang/Object;

    .line 334
    .line 335
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    goto :goto_6

    .line 339
    :catch_2
    move-exception v0

    .line 340
    goto :goto_5

    .line 341
    :cond_9
    sget-object v4, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 342
    .line 343
    const-string v5, "Emu wasn\'t checked yet."

    .line 344
    .line 345
    new-array v6, v9, [Ljava/lang/Object;

    .line 346
    .line 347
    invoke-virtual {v4, v10, v5, v6}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    iget-object v4, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 351
    .line 352
    iget-object v4, v4, Lcom/quago/mobile/sdk/o0;->u:Ljava/lang/ref/WeakReference;

    .line 353
    .line 354
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    check-cast v4, Landroid/app/Application;

    .line 359
    .line 360
    if-eqz v4, :cond_a

    .line 361
    .line 362
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    if-eqz v4, :cond_a

    .line 367
    .line 368
    invoke-static {v4}, Lcom/quago/mobile/sdk/n;->a(Landroid/content/Context;)Ljava/util/TreeMap;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    invoke-virtual {v4}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-eqz v5, :cond_a

    .line 385
    .line 386
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    check-cast v5, Ljava/util/Map$Entry;

    .line 391
    .line 392
    new-instance v6, Lcom/quago/mobile/sdk/b1;

    .line 393
    .line 394
    invoke-direct {v6}, Lcom/quago/mobile/sdk/b1;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-virtual {v6, v7}, Lcom/quago/mobile/sdk/b1;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    check-cast v5, Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v0, v5, v6}, Lcom/quago/mobile/sdk/a1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_a
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-interface {v0, v3, v12}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 424
    .line 425
    .line 426
    goto :goto_6

    .line 427
    :goto_5
    :try_start_5
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 428
    .line 429
    invoke-virtual {v2, v10, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 430
    .line 431
    .line 432
    :cond_b
    :goto_6
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/n0;->b()V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_19

    .line 436
    .line 437
    :pswitch_3
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 438
    .line 439
    const-string v3, "SET_ADDITIONAL_ID"

    .line 440
    .line 441
    new-array v4, v9, [Ljava/lang/Object;

    .line 442
    .line 443
    invoke-virtual {v2, v10, v3, v4}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 447
    .line 448
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 449
    .line 450
    if-eqz v4, :cond_c

    .line 451
    .line 452
    move v5, v12

    .line 453
    goto :goto_7

    .line 454
    :cond_c
    move v5, v9

    .line 455
    :goto_7
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 456
    .line 457
    if-eqz v3, :cond_d

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_d
    move v12, v9

    .line 461
    :goto_8
    if-nez v5, :cond_e

    .line 462
    .line 463
    if-nez v12, :cond_e

    .line 464
    .line 465
    const-string v0, "setAdditionalId() ignored due to not having an active Segment."

    .line 466
    .line 467
    new-array v1, v9, [Ljava/lang/Object;

    .line 468
    .line 469
    invoke-virtual {v2, v10, v0, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :cond_e
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 474
    .line 475
    instance-of v3, v0, Ljava/lang/String;

    .line 476
    .line 477
    if-nez v3, :cond_f

    .line 478
    .line 479
    const-string v0, "AdditionalId object must be String"

    .line 480
    .line 481
    new-array v1, v9, [Ljava/lang/Object;

    .line 482
    .line 483
    invoke-virtual {v2, v10, v0, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :cond_f
    check-cast v0, Ljava/lang/String;

    .line 488
    .line 489
    if-eqz v5, :cond_10

    .line 490
    .line 491
    iput-object v0, v4, Lcom/quago/mobile/sdk/a1;->k:Ljava/lang/String;

    .line 492
    .line 493
    const-string v3, "AdditionalId for Segment %s = %s"

    .line 494
    .line 495
    invoke-virtual {v4}, Lcom/quago/mobile/sdk/a1;->a()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    iget-object v5, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 504
    .line 505
    iget-object v5, v5, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 506
    .line 507
    iget-object v5, v5, Lcom/quago/mobile/sdk/a1;->k:Ljava/lang/String;

    .line 508
    .line 509
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    invoke-virtual {v2, v10, v3, v4}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    :cond_10
    if-eqz v12, :cond_32

    .line 517
    .line 518
    iget-object v1, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 519
    .line 520
    iget-object v1, v1, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 521
    .line 522
    iput-object v0, v1, Lcom/quago/mobile/sdk/a1;->k:Ljava/lang/String;

    .line 523
    .line 524
    const-string v1, "AdditionalId for Tracking Segment = %s"

    .line 525
    .line 526
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {v2, v10, v1, v0}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_4
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 535
    .line 536
    const-string v3, "SET_USER_ID"

    .line 537
    .line 538
    new-array v4, v9, [Ljava/lang/Object;

    .line 539
    .line 540
    invoke-virtual {v2, v10, v3, v4}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 544
    .line 545
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 546
    .line 547
    if-eqz v4, :cond_11

    .line 548
    .line 549
    move v5, v12

    .line 550
    goto :goto_9

    .line 551
    :cond_11
    move v5, v9

    .line 552
    :goto_9
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 553
    .line 554
    if-eqz v3, :cond_12

    .line 555
    .line 556
    move v3, v12

    .line 557
    goto :goto_a

    .line 558
    :cond_12
    move v3, v9

    .line 559
    :goto_a
    if-nez v5, :cond_13

    .line 560
    .line 561
    if-nez v3, :cond_13

    .line 562
    .line 563
    const-string v0, "setUserId() ignored due to not having an active Segment."

    .line 564
    .line 565
    new-array v1, v9, [Ljava/lang/Object;

    .line 566
    .line 567
    invoke-virtual {v2, v10, v0, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :cond_13
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 572
    .line 573
    instance-of v6, v0, Ljava/lang/String;

    .line 574
    .line 575
    if-nez v6, :cond_14

    .line 576
    .line 577
    const-string v0, "userId object must be String"

    .line 578
    .line 579
    new-array v1, v9, [Ljava/lang/Object;

    .line 580
    .line 581
    invoke-virtual {v2, v10, v0, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    return-void

    .line 585
    :cond_14
    check-cast v0, Ljava/lang/String;

    .line 586
    .line 587
    if-eqz v5, :cond_15

    .line 588
    .line 589
    iput-object v0, v4, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 590
    .line 591
    const-string v6, "UserId for Segment %s = %s"

    .line 592
    .line 593
    invoke-virtual {v4}, Lcom/quago/mobile/sdk/a1;->a()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v4

    .line 601
    iget-object v7, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 602
    .line 603
    iget-object v7, v7, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 604
    .line 605
    iget-object v7, v7, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 606
    .line 607
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v7

    .line 611
    filled-new-array {v4, v7}, [Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    invoke-virtual {v2, v10, v6, v4}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    move v4, v12

    .line 619
    goto :goto_b

    .line 620
    :cond_15
    move v4, v9

    .line 621
    :goto_b
    if-eqz v3, :cond_17

    .line 622
    .line 623
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 624
    .line 625
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 626
    .line 627
    iget-object v6, v3, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 628
    .line 629
    if-nez v6, :cond_16

    .line 630
    .line 631
    iput-object v0, v3, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 632
    .line 633
    const-string v3, "Set UserId for Tracking Segment = %s"

    .line 634
    .line 635
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    invoke-virtual {v2, v10, v3, v4}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    goto :goto_c

    .line 643
    :cond_16
    const-string v3, "UserId was already set, end then begin Tracking with the new UserId."

    .line 644
    .line 645
    new-array v6, v9, [Ljava/lang/Object;

    .line 646
    .line 647
    invoke-virtual {v2, v10, v3, v6}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    :cond_17
    if-eqz v4, :cond_32

    .line 651
    .line 652
    :goto_c
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 653
    .line 654
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->G:Ljava/lang/String;

    .line 655
    .line 656
    if-eqz v3, :cond_18

    .line 657
    .line 658
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v3

    .line 662
    if-nez v3, :cond_32

    .line 663
    .line 664
    :cond_18
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 665
    .line 666
    iput-object v0, v3, Lcom/quago/mobile/sdk/o0;->G:Ljava/lang/String;

    .line 667
    .line 668
    if-eqz v5, :cond_19

    .line 669
    .line 670
    iput v12, v3, Lcom/quago/mobile/sdk/o0;->i:I

    .line 671
    .line 672
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 673
    .line 674
    iput v12, v4, Lcom/quago/mobile/sdk/a1;->m:I

    .line 675
    .line 676
    :cond_19
    new-instance v4, Lcom/quago/mobile/sdk/a1;

    .line 677
    .line 678
    move-object v5, v4

    .line 679
    const-string v4, "USERID"

    .line 680
    .line 681
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 682
    .line 683
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v6

    .line 687
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 688
    .line 689
    iget-object v7, v3, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 690
    .line 691
    new-instance v8, Lcom/quago/mobile/sdk/g1;

    .line 692
    .line 693
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 694
    .line 695
    invoke-direct {v8, v3}, Lcom/quago/mobile/sdk/g1;-><init>(Lcom/quago/mobile/sdk/g1;)V

    .line 696
    .line 697
    .line 698
    move-object v3, v5

    .line 699
    move-object v5, v0

    .line 700
    invoke-direct/range {v3 .. v8}, Lcom/quago/mobile/sdk/a1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/quago/mobile/sdk/p0;Lcom/quago/mobile/sdk/g1;)V

    .line 701
    .line 702
    .line 703
    iput-boolean v12, v3, Lcom/quago/mobile/sdk/a1;->n:Z

    .line 704
    .line 705
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 706
    .line 707
    .line 708
    move-result-wide v4

    .line 709
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 710
    .line 711
    .line 712
    move-result-wide v6

    .line 713
    iput-wide v4, v3, Lcom/quago/mobile/sdk/a1;->d:J

    .line 714
    .line 715
    iput-wide v6, v3, Lcom/quago/mobile/sdk/a1;->f:J

    .line 716
    .line 717
    iget-object v0, v3, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 718
    .line 719
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    invoke-virtual {v2, v10, v13, v0}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    move-object v2, v3

    .line 731
    move-wide v3, v4

    .line 732
    move-wide v5, v6

    .line 733
    const/4 v7, 0x1

    .line 734
    const/4 v8, 0x2

    .line 735
    invoke-virtual/range {v1 .. v8}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    .line 736
    .line 737
    .line 738
    return-void

    .line 739
    :pswitch_5
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 740
    .line 741
    const-string v2, "ON_RELEASE"

    .line 742
    .line 743
    new-array v3, v9, [Ljava/lang/Object;

    .line 744
    .line 745
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 749
    .line 750
    iput-boolean v9, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 751
    .line 752
    invoke-virtual {v1, v15}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    return-void

    .line 756
    :pswitch_6
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 757
    .line 758
    const-string v3, "SET_KEY_VALUE"

    .line 759
    .line 760
    new-array v4, v9, [Ljava/lang/Object;

    .line 761
    .line 762
    invoke-virtual {v2, v10, v3, v4}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 766
    .line 767
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 768
    .line 769
    if-eqz v4, :cond_1a

    .line 770
    .line 771
    move v5, v12

    .line 772
    goto :goto_d

    .line 773
    :cond_1a
    move v5, v9

    .line 774
    :goto_d
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 775
    .line 776
    if-eqz v3, :cond_1b

    .line 777
    .line 778
    move v3, v12

    .line 779
    goto :goto_e

    .line 780
    :cond_1b
    move v3, v9

    .line 781
    :goto_e
    if-nez v5, :cond_1c

    .line 782
    .line 783
    if-nez v3, :cond_1c

    .line 784
    .line 785
    const-string v0, "setKeyValue() ignored due to not having an active Segment."

    .line 786
    .line 787
    new-array v1, v9, [Ljava/lang/Object;

    .line 788
    .line 789
    invoke-virtual {v2, v10, v0, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    return-void

    .line 793
    :cond_1c
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v0, [Ljava/lang/String;

    .line 796
    .line 797
    if-eqz v5, :cond_1d

    .line 798
    .line 799
    aget-object v5, v0, v9

    .line 800
    .line 801
    aget-object v6, v0, v12

    .line 802
    .line 803
    invoke-virtual {v4, v5, v6}, Lcom/quago/mobile/sdk/a1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    const-string v4, "KeyValues for Segment %s = [%s,%s]"

    .line 807
    .line 808
    iget-object v5, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 809
    .line 810
    iget-object v5, v5, Lcom/quago/mobile/sdk/o0;->D:Lcom/quago/mobile/sdk/a1;

    .line 811
    .line 812
    invoke-virtual {v5}, Lcom/quago/mobile/sdk/a1;->a()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v5

    .line 816
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v5

    .line 820
    aget-object v6, v0, v9

    .line 821
    .line 822
    aget-object v7, v0, v12

    .line 823
    .line 824
    filled-new-array {v5, v6, v7}, [Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v5

    .line 828
    invoke-virtual {v2, v10, v4, v5}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    :cond_1d
    if-eqz v3, :cond_32

    .line 832
    .line 833
    iget-object v1, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 834
    .line 835
    iget-object v1, v1, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 836
    .line 837
    aget-object v3, v0, v9

    .line 838
    .line 839
    aget-object v4, v0, v12

    .line 840
    .line 841
    invoke-virtual {v1, v3, v4}, Lcom/quago/mobile/sdk/a1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    const-string v1, "KeyValues for Tracking Segment = [%s,%s]"

    .line 845
    .line 846
    aget-object v3, v0, v9

    .line 847
    .line 848
    aget-object v0, v0, v12

    .line 849
    .line 850
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-virtual {v2, v10, v1, v0}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :pswitch_7
    iget-object v0, v5, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 859
    .line 860
    if-nez v0, :cond_1e

    .line 861
    .line 862
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 863
    .line 864
    const-string v1, "End Tracking called without an active tracking segment."

    .line 865
    .line 866
    new-array v2, v9, [Ljava/lang/Object;

    .line 867
    .line 868
    invoke-virtual {v0, v10, v1, v2}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    .line 870
    .line 871
    return-void

    .line 872
    :cond_1e
    invoke-virtual {v1, v14}, Landroid/os/Handler;->removeMessages(I)V

    .line 873
    .line 874
    .line 875
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 876
    .line 877
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 878
    .line 879
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    if-le v0, v2, :cond_1f

    .line 884
    .line 885
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 886
    .line 887
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 888
    .line 889
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 890
    .line 891
    .line 892
    move-result v0

    .line 893
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 894
    .line 895
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 896
    .line 897
    iget v2, v2, Lcom/quago/mobile/sdk/a1;->l:I

    .line 898
    .line 899
    if-gt v0, v2, :cond_1f

    .line 900
    .line 901
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 902
    .line 903
    const-string v2, "Ending last tracking segment"

    .line 904
    .line 905
    new-array v3, v9, [Ljava/lang/Object;

    .line 906
    .line 907
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 908
    .line 909
    .line 910
    const/4 v12, 0x2

    .line 911
    :goto_f
    move v7, v12

    .line 912
    goto :goto_10

    .line 913
    :cond_1f
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 914
    .line 915
    const-string v2, "Segment tracking ended."

    .line 916
    .line 917
    new-array v3, v9, [Ljava/lang/Object;

    .line 918
    .line 919
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 920
    .line 921
    .line 922
    goto :goto_f

    .line 923
    :goto_10
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 924
    .line 925
    iget-object v2, v0, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 926
    .line 927
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 928
    .line 929
    .line 930
    move-result-wide v3

    .line 931
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 932
    .line 933
    .line 934
    move-result-wide v5

    .line 935
    const/4 v8, 0x1

    .line 936
    invoke-virtual/range {v1 .. v8}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    .line 937
    .line 938
    .line 939
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 940
    .line 941
    iput-object v15, v0, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 942
    .line 943
    iput v9, v0, Lcom/quago/mobile/sdk/o0;->j:I

    .line 944
    .line 945
    return-void

    .line 946
    :pswitch_8
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 947
    .line 948
    const-string v2, "TRACKING_CHECK"

    .line 949
    .line 950
    new-array v3, v9, [Ljava/lang/Object;

    .line 951
    .line 952
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 956
    .line 957
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 958
    .line 959
    if-nez v2, :cond_20

    .line 960
    .line 961
    goto/16 :goto_19

    .line 962
    .line 963
    :cond_20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 964
    .line 965
    .line 966
    move-result-wide v3

    .line 967
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 968
    .line 969
    .line 970
    move-result-wide v18

    .line 971
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 972
    .line 973
    iget-object v5, v2, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 974
    .line 975
    iget-wide v5, v5, Lcom/quago/mobile/sdk/a1;->f:J

    .line 976
    .line 977
    sub-long v5, v18, v5

    .line 978
    .line 979
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 980
    .line 981
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getAutoMaxDurationMillis()J

    .line 982
    .line 983
    .line 984
    move-result-wide v7

    .line 985
    cmp-long v2, v5, v7

    .line 986
    .line 987
    if-ltz v2, :cond_21

    .line 988
    .line 989
    const-string v2, "Tracking Condition met = Duration"

    .line 990
    .line 991
    new-array v5, v9, [Ljava/lang/Object;

    .line 992
    .line 993
    invoke-virtual {v0, v10, v2, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    const/4 v9, 0x4

    .line 997
    move/from16 v16, v12

    .line 998
    .line 999
    move-wide/from16 v7, v18

    .line 1000
    .line 1001
    goto :goto_11

    .line 1002
    :cond_21
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1003
    .line 1004
    iget-object v5, v2, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 1005
    .line 1006
    iget-object v15, v5, Lcom/quago/mobile/sdk/i;->c:Lcom/quago/mobile/sdk/k;

    .line 1007
    .line 1008
    iget-object v5, v2, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1009
    .line 1010
    iget-wide v5, v5, Lcom/quago/mobile/sdk/a1;->f:J

    .line 1011
    .line 1012
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1013
    .line 1014
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getAutoMotionAmount()I

    .line 1015
    .line 1016
    .line 1017
    move-result v20

    .line 1018
    move-wide/from16 v16, v5

    .line 1019
    .line 1020
    invoke-static/range {v15 .. v20}, Lcom/quago/mobile/sdk/f1;->a(Lcom/quago/mobile/sdk/k;JJI)J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v5

    .line 1024
    move-wide/from16 v7, v18

    .line 1025
    .line 1026
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1027
    .line 1028
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1029
    .line 1030
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getAutoMotionAmount()I

    .line 1031
    .line 1032
    .line 1033
    move-result v2

    .line 1034
    move/from16 v16, v12

    .line 1035
    .line 1036
    int-to-long v12, v2

    .line 1037
    cmp-long v2, v5, v12

    .line 1038
    .line 1039
    if-ltz v2, :cond_22

    .line 1040
    .line 1041
    const-string v2, "Tracking Condition met = Amount"

    .line 1042
    .line 1043
    new-array v5, v9, [Ljava/lang/Object;

    .line 1044
    .line 1045
    invoke-virtual {v0, v10, v2, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1046
    .line 1047
    .line 1048
    const/4 v9, 0x3

    .line 1049
    :cond_22
    :goto_11
    if-eqz v9, :cond_24

    .line 1050
    .line 1051
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1052
    .line 1053
    iget v2, v0, Lcom/quago/mobile/sdk/o0;->h:I

    .line 1054
    .line 1055
    add-int/lit8 v2, v2, 0x1

    .line 1056
    .line 1057
    iput v2, v0, Lcom/quago/mobile/sdk/o0;->h:I

    .line 1058
    .line 1059
    iget v2, v0, Lcom/quago/mobile/sdk/o0;->j:I

    .line 1060
    .line 1061
    add-int/lit8 v2, v2, 0x1

    .line 1062
    .line 1063
    iput v2, v0, Lcom/quago/mobile/sdk/o0;->j:I

    .line 1064
    .line 1065
    new-instance v15, Lcom/quago/mobile/sdk/a1;

    .line 1066
    .line 1067
    iget-object v2, v0, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1068
    .line 1069
    iget-object v5, v2, Lcom/quago/mobile/sdk/a1;->a:Ljava/lang/String;

    .line 1070
    .line 1071
    iget-object v2, v2, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 1072
    .line 1073
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 1074
    .line 1075
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v18

    .line 1079
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1080
    .line 1081
    iget-object v6, v0, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 1082
    .line 1083
    new-instance v11, Lcom/quago/mobile/sdk/g1;

    .line 1084
    .line 1085
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 1086
    .line 1087
    invoke-direct {v11, v0}, Lcom/quago/mobile/sdk/g1;-><init>(Lcom/quago/mobile/sdk/g1;)V

    .line 1088
    .line 1089
    .line 1090
    move-object/from16 v17, v2

    .line 1091
    .line 1092
    move-object/from16 v16, v5

    .line 1093
    .line 1094
    move-object/from16 v19, v6

    .line 1095
    .line 1096
    move-object/from16 v20, v11

    .line 1097
    .line 1098
    invoke-direct/range {v15 .. v20}, Lcom/quago/mobile/sdk/a1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/quago/mobile/sdk/p0;Lcom/quago/mobile/sdk/g1;)V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v15, v3, v4, v7, v8}, Lcom/quago/mobile/sdk/a1;->a(JJ)V

    .line 1102
    .line 1103
    .line 1104
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1105
    .line 1106
    iget v2, v0, Lcom/quago/mobile/sdk/o0;->h:I

    .line 1107
    .line 1108
    iput v2, v15, Lcom/quago/mobile/sdk/a1;->l:I

    .line 1109
    .line 1110
    iget v2, v0, Lcom/quago/mobile/sdk/o0;->j:I

    .line 1111
    .line 1112
    iput v2, v15, Lcom/quago/mobile/sdk/a1;->m:I

    .line 1113
    .line 1114
    iget-object v2, v0, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1115
    .line 1116
    if-eqz v2, :cond_23

    .line 1117
    .line 1118
    iget-object v0, v2, Lcom/quago/mobile/sdk/a1;->k:Ljava/lang/String;

    .line 1119
    .line 1120
    if-eqz v0, :cond_23

    .line 1121
    .line 1122
    iput-object v0, v15, Lcom/quago/mobile/sdk/a1;->k:Ljava/lang/String;

    .line 1123
    .line 1124
    :cond_23
    move-wide/from16 v18, v7

    .line 1125
    .line 1126
    const/4 v8, 0x1

    .line 1127
    move v7, v9

    .line 1128
    move-wide/from16 v5, v18

    .line 1129
    .line 1130
    invoke-virtual/range {v1 .. v8}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    .line 1131
    .line 1132
    .line 1133
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1134
    .line 1135
    iput-object v15, v0, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1136
    .line 1137
    :cond_24
    invoke-static {v1, v14}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1142
    .line 1143
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1144
    .line 1145
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getAutoMotionIntervalMillis()J

    .line 1146
    .line 1147
    .line 1148
    move-result-wide v2

    .line 1149
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1150
    .line 1151
    .line 1152
    goto/16 :goto_19

    .line 1153
    .line 1154
    :pswitch_9
    move/from16 v16, v12

    .line 1155
    .line 1156
    iget-boolean v3, v5, Lcom/quago/mobile/sdk/o0;->l:Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 1157
    .line 1158
    const-string v11, "MaxTrackingSegment of %s reached!"

    .line 1159
    .line 1160
    if-eqz v3, :cond_25

    .line 1161
    .line 1162
    :try_start_6
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1163
    .line 1164
    invoke-virtual {v6}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 1165
    .line 1166
    .line 1167
    move-result v1

    .line 1168
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v1

    .line 1172
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v1

    .line 1176
    invoke-virtual {v0, v10, v11, v1}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1177
    .line 1178
    .line 1179
    return-void

    .line 1180
    :cond_25
    iget-object v3, v5, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1181
    .line 1182
    if-eqz v3, :cond_26

    .line 1183
    .line 1184
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1185
    .line 1186
    const-string v1, "beginTracking() was called while already tracking, ignoring call!"

    .line 1187
    .line 1188
    new-array v2, v9, [Ljava/lang/Object;

    .line 1189
    .line 1190
    invoke-virtual {v0, v10, v1, v2}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1191
    .line 1192
    .line 1193
    return-void

    .line 1194
    :cond_26
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1195
    .line 1196
    check-cast v0, Lcom/quago/mobile/sdk/a1;

    .line 1197
    .line 1198
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1199
    .line 1200
    .line 1201
    move-result-wide v3

    .line 1202
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1203
    .line 1204
    .line 1205
    move-result-wide v5

    .line 1206
    iget-object v7, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1207
    .line 1208
    iget v8, v7, Lcom/quago/mobile/sdk/o0;->h:I

    .line 1209
    .line 1210
    add-int/lit8 v8, v8, 0x1

    .line 1211
    .line 1212
    iput v8, v7, Lcom/quago/mobile/sdk/o0;->h:I

    .line 1213
    .line 1214
    iget v8, v7, Lcom/quago/mobile/sdk/o0;->j:I

    .line 1215
    .line 1216
    add-int/lit8 v8, v8, 0x1

    .line 1217
    .line 1218
    iput v8, v7, Lcom/quago/mobile/sdk/o0;->j:I

    .line 1219
    .line 1220
    iget-object v7, v7, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1221
    .line 1222
    invoke-virtual {v7}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 1223
    .line 1224
    .line 1225
    move-result v7

    .line 1226
    if-le v7, v2, :cond_2a

    .line 1227
    .line 1228
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1229
    .line 1230
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1231
    .line 1232
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 1233
    .line 1234
    .line 1235
    move-result v2

    .line 1236
    iget-object v7, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1237
    .line 1238
    iget v8, v7, Lcom/quago/mobile/sdk/o0;->h:I

    .line 1239
    .line 1240
    if-ge v2, v8, :cond_28

    .line 1241
    .line 1242
    iget-object v0, v7, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1243
    .line 1244
    if-eqz v0, :cond_27

    .line 1245
    .line 1246
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1247
    .line 1248
    const-string v2, "Ending Tracking last segment"

    .line 1249
    .line 1250
    new-array v3, v9, [Ljava/lang/Object;

    .line 1251
    .line 1252
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1253
    .line 1254
    .line 1255
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1256
    .line 1257
    iget-object v2, v0, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1258
    .line 1259
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1260
    .line 1261
    .line 1262
    move-result-wide v3

    .line 1263
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1264
    .line 1265
    .line 1266
    move-result-wide v5

    .line 1267
    const/4 v7, 0x2

    .line 1268
    const/4 v8, 0x1

    .line 1269
    invoke-virtual/range {v1 .. v8}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    .line 1270
    .line 1271
    .line 1272
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1273
    .line 1274
    iput-object v15, v0, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1275
    .line 1276
    :cond_27
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1277
    .line 1278
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1279
    .line 1280
    iget-object v2, v2, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1281
    .line 1282
    invoke-virtual {v2}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 1283
    .line 1284
    .line 1285
    move-result v2

    .line 1286
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v2

    .line 1290
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v2

    .line 1294
    invoke-virtual {v0, v10, v11, v2}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1295
    .line 1296
    .line 1297
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1298
    .line 1299
    move/from16 v1, v16

    .line 1300
    .line 1301
    iput-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->l:Z

    .line 1302
    .line 1303
    return-void

    .line 1304
    :cond_28
    iget-object v2, v0, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 1305
    .line 1306
    if-nez v2, :cond_29

    .line 1307
    .line 1308
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1309
    .line 1310
    const-string v7, "Begin Tracking [%s/%s]"

    .line 1311
    .line 1312
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v8

    .line 1316
    iget-object v9, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1317
    .line 1318
    iget-object v9, v9, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1319
    .line 1320
    invoke-virtual {v9}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 1321
    .line 1322
    .line 1323
    move-result v9

    .line 1324
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v9

    .line 1328
    filled-new-array {v8, v9}, [Ljava/lang/Object;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v8

    .line 1332
    invoke-virtual {v2, v10, v7, v8}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_12

    .line 1336
    :cond_29
    sget-object v7, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1337
    .line 1338
    const-string v9, "Begin Tracking userId = %s [%s/%s]"

    .line 1339
    .line 1340
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v8

    .line 1344
    iget-object v11, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1345
    .line 1346
    iget-object v11, v11, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1347
    .line 1348
    invoke-virtual {v11}, Lcom/quago/mobile/sdk/QuagoSettings;->getMaxSegments()I

    .line 1349
    .line 1350
    .line 1351
    move-result v11

    .line 1352
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v11

    .line 1356
    filled-new-array {v2, v8, v11}, [Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v2

    .line 1360
    invoke-virtual {v7, v10, v9, v2}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    .line 1362
    .line 1363
    goto :goto_12

    .line 1364
    :cond_2a
    iget-object v2, v0, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 1365
    .line 1366
    if-nez v2, :cond_2b

    .line 1367
    .line 1368
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1369
    .line 1370
    const-string v7, "Begin Tracking"

    .line 1371
    .line 1372
    new-array v8, v9, [Ljava/lang/Object;

    .line 1373
    .line 1374
    invoke-virtual {v2, v10, v7, v8}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1375
    .line 1376
    .line 1377
    goto :goto_12

    .line 1378
    :cond_2b
    sget-object v7, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1379
    .line 1380
    const-string v8, "Begin Tracking userId = %s"

    .line 1381
    .line 1382
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v2

    .line 1386
    invoke-virtual {v7, v10, v8, v2}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1387
    .line 1388
    .line 1389
    :goto_12
    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/quago/mobile/sdk/a1;->a(JJ)V

    .line 1390
    .line 1391
    .line 1392
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1393
    .line 1394
    iget v3, v2, Lcom/quago/mobile/sdk/o0;->h:I

    .line 1395
    .line 1396
    iput v3, v0, Lcom/quago/mobile/sdk/a1;->l:I

    .line 1397
    .line 1398
    iget v3, v2, Lcom/quago/mobile/sdk/o0;->j:I

    .line 1399
    .line 1400
    iput v3, v0, Lcom/quago/mobile/sdk/a1;->m:I

    .line 1401
    .line 1402
    iput-object v0, v2, Lcom/quago/mobile/sdk/o0;->E:Lcom/quago/mobile/sdk/a1;

    .line 1403
    .line 1404
    invoke-static {v1, v14}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v2

    .line 1408
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1409
    .line 1410
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1411
    .line 1412
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getAutoMotionIntervalMillis()J

    .line 1413
    .line 1414
    .line 1415
    move-result-wide v3

    .line 1416
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1417
    .line 1418
    .line 1419
    iget-object v2, v0, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 1420
    .line 1421
    if-eqz v2, :cond_32

    .line 1422
    .line 1423
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1424
    .line 1425
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->G:Ljava/lang/String;

    .line 1426
    .line 1427
    if-eqz v3, :cond_2c

    .line 1428
    .line 1429
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1430
    .line 1431
    .line 1432
    move-result v2

    .line 1433
    if-nez v2, :cond_32

    .line 1434
    .line 1435
    :cond_2c
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1436
    .line 1437
    iget-object v5, v0, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 1438
    .line 1439
    iput-object v5, v2, Lcom/quago/mobile/sdk/o0;->G:Ljava/lang/String;

    .line 1440
    .line 1441
    new-instance v3, Lcom/quago/mobile/sdk/a1;

    .line 1442
    .line 1443
    const-string v4, "USERID"

    .line 1444
    .line 1445
    iget-object v0, v2, Lcom/quago/mobile/sdk/o0;->f:Lcom/quago/mobile/sdk/c1;

    .line 1446
    .line 1447
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/c1;->a()Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v6

    .line 1451
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1452
    .line 1453
    iget-object v7, v0, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 1454
    .line 1455
    new-instance v8, Lcom/quago/mobile/sdk/g1;

    .line 1456
    .line 1457
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->x:Lcom/quago/mobile/sdk/g1;

    .line 1458
    .line 1459
    invoke-direct {v8, v0}, Lcom/quago/mobile/sdk/g1;-><init>(Lcom/quago/mobile/sdk/g1;)V

    .line 1460
    .line 1461
    .line 1462
    invoke-direct/range {v3 .. v8}, Lcom/quago/mobile/sdk/a1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/quago/mobile/sdk/p0;Lcom/quago/mobile/sdk/g1;)V

    .line 1463
    .line 1464
    .line 1465
    move-object v2, v3

    .line 1466
    const/4 v3, 0x1

    .line 1467
    iput-boolean v3, v2, Lcom/quago/mobile/sdk/a1;->n:Z

    .line 1468
    .line 1469
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1470
    .line 1471
    .line 1472
    move-result-wide v3

    .line 1473
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1474
    .line 1475
    .line 1476
    move-result-wide v5

    .line 1477
    iput-wide v3, v2, Lcom/quago/mobile/sdk/a1;->d:J

    .line 1478
    .line 1479
    iput-wide v5, v2, Lcom/quago/mobile/sdk/a1;->f:J

    .line 1480
    .line 1481
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1482
    .line 1483
    iget-object v7, v2, Lcom/quago/mobile/sdk/a1;->j:Ljava/lang/String;

    .line 1484
    .line 1485
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v7

    .line 1489
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v7

    .line 1493
    invoke-virtual {v0, v10, v13, v7}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1494
    .line 1495
    .line 1496
    const/4 v7, 0x1

    .line 1497
    const/4 v8, 0x2

    .line 1498
    invoke-virtual/range {v1 .. v8}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;JJII)V

    .line 1499
    .line 1500
    .line 1501
    return-void

    .line 1502
    :pswitch_a
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/n0;->b()V

    .line 1503
    .line 1504
    .line 1505
    return-void

    .line 1506
    :pswitch_b
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1507
    .line 1508
    check-cast v0, Lcom/quago/mobile/sdk/a1;

    .line 1509
    .line 1510
    invoke-virtual {v1, v0}, Lcom/quago/mobile/sdk/n0;->a(Lcom/quago/mobile/sdk/a1;)V

    .line 1511
    .line 1512
    .line 1513
    return-void

    .line 1514
    :cond_2d
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1515
    .line 1516
    const-string v3, "Quago SDK Initialized"

    .line 1517
    .line 1518
    new-array v4, v9, [Ljava/lang/Object;

    .line 1519
    .line 1520
    invoke-virtual {v0, v10, v3, v4}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1521
    .line 1522
    .line 1523
    const-string v3, "SDK Version = %s, AppToken = %s"

    .line 1524
    .line 1525
    const-string v4, "1.15.0"

    .line 1526
    .line 1527
    iget-object v5, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1528
    .line 1529
    iget-object v5, v5, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1530
    .line 1531
    invoke-virtual {v5}, Lcom/quago/mobile/sdk/QuagoSettings;->getAppToken()Ljava/lang/String;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v5

    .line 1535
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v4

    .line 1539
    invoke-virtual {v0, v10, v3, v4}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1540
    .line 1541
    .line 1542
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1543
    .line 1544
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1545
    .line 1546
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getDefaultAdditionalId()Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v3

    .line 1550
    if-eqz v3, :cond_2e

    .line 1551
    .line 1552
    const-string v3, "DefaultAdditionalId = %s"

    .line 1553
    .line 1554
    iget-object v4, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1555
    .line 1556
    iget-object v4, v4, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1557
    .line 1558
    invoke-virtual {v4}, Lcom/quago/mobile/sdk/QuagoSettings;->getDefaultAdditionalId()Ljava/lang/String;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v4

    .line 1562
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v4

    .line 1566
    invoke-virtual {v0, v10, v3, v4}, Lcom/quago/mobile/sdk/j0;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1567
    .line 1568
    .line 1569
    :cond_2e
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1570
    .line 1571
    iget-object v4, v3, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 1572
    .line 1573
    if-eqz v4, :cond_31

    .line 1574
    .line 1575
    iget-object v4, v4, Lcom/quago/mobile/sdk/p0;->d:Lcom/quago/mobile/sdk/h0;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 1576
    .line 1577
    if-nez v4, :cond_2f

    .line 1578
    .line 1579
    goto/16 :goto_17

    .line 1580
    .line 1581
    :cond_2f
    :try_start_7
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->n:Lcom/quago/mobile/sdk/y0;

    .line 1582
    .line 1583
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/y0;->a()Z

    .line 1584
    .line 1585
    .line 1586
    move-result v3

    .line 1587
    iget-object v4, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1588
    .line 1589
    iget-object v4, v4, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 1590
    .line 1591
    iget-object v4, v4, Lcom/quago/mobile/sdk/p0;->c:Lcom/quago/mobile/sdk/z0;

    .line 1592
    .line 1593
    iput-boolean v3, v4, Lcom/quago/mobile/sdk/z0;->c:Z

    .line 1594
    .line 1595
    const-string v4, "isRooted = %s"

    .line 1596
    .line 1597
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v3

    .line 1601
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v3

    .line 1605
    invoke-virtual {v0, v2, v4, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 1606
    .line 1607
    .line 1608
    goto :goto_13

    .line 1609
    :catch_3
    move-exception v0

    .line 1610
    :try_start_8
    sget-object v3, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1611
    .line 1612
    invoke-virtual {v3, v2, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 1613
    .line 1614
    .line 1615
    :goto_13
    :try_start_9
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1616
    .line 1617
    const-string v2, "QuagoDetector Launched"

    .line 1618
    .line 1619
    new-array v3, v9, [Ljava/lang/Object;

    .line 1620
    .line 1621
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1622
    .line 1623
    .line 1624
    new-instance v2, Lcom/quago/mobile/sdk/e0;

    .line 1625
    .line 1626
    invoke-direct {v2}, Lcom/quago/mobile/sdk/e0;-><init>()V

    .line 1627
    .line 1628
    .line 1629
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1630
    .line 1631
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->s:Lcom/quago/mobile/sdk/p0;

    .line 1632
    .line 1633
    iget-object v3, v3, Lcom/quago/mobile/sdk/p0;->d:Lcom/quago/mobile/sdk/h0;

    .line 1634
    .line 1635
    invoke-virtual {v3, v2}, Lcom/quago/mobile/sdk/h0;->a(Lcom/quago/mobile/sdk/e0;)V

    .line 1636
    .line 1637
    .line 1638
    invoke-static {}, Lcom/quago/mobile/sdk/e0;->a()V

    .line 1639
    .line 1640
    .line 1641
    const-string v2, "QuagoDetector Complete"

    .line 1642
    .line 1643
    new-array v3, v9, [Ljava/lang/Object;

    .line 1644
    .line 1645
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    .line 1646
    .line 1647
    .line 1648
    goto :goto_14

    .line 1649
    :catch_4
    move-exception v0

    .line 1650
    :try_start_a
    sget-object v2, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1651
    .line 1652
    invoke-virtual {v2, v10, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 1653
    .line 1654
    .line 1655
    :goto_14
    :try_start_b
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/n0;->a()Landroid/content/SharedPreferences;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    .line 1659
    iget-object v2, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1660
    .line 1661
    if-eqz v0, :cond_30

    .line 1662
    .line 1663
    :try_start_c
    invoke-interface {v0, v11}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v0

    .line 1667
    const/4 v3, 0x1

    .line 1668
    xor-int/2addr v0, v3

    .line 1669
    iput-boolean v0, v2, Lcom/quago/mobile/sdk/o0;->m:Z

    .line 1670
    .line 1671
    goto :goto_15

    .line 1672
    :catch_5
    move-exception v0

    .line 1673
    goto :goto_16

    .line 1674
    :cond_30
    const/4 v3, 0x1

    .line 1675
    iput-boolean v3, v2, Lcom/quago/mobile/sdk/o0;->m:Z

    .line 1676
    .line 1677
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1678
    .line 1679
    const-string v2, "sharedPref = null for TouchSegment check."

    .line 1680
    .line 1681
    new-array v3, v9, [Ljava/lang/Object;

    .line 1682
    .line 1683
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1684
    .line 1685
    .line 1686
    :goto_15
    sget-object v0, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1687
    .line 1688
    const-string v2, "is_new = %s"

    .line 1689
    .line 1690
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1691
    .line 1692
    iget-boolean v3, v3, Lcom/quago/mobile/sdk/o0;->m:Z

    .line 1693
    .line 1694
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v3

    .line 1698
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v3

    .line 1702
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1703
    .line 1704
    .line 1705
    const-string v2, "isTouchSegmentDisabled = %s"

    .line 1706
    .line 1707
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1708
    .line 1709
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1710
    .line 1711
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->isTouchSegmentDisabled()Z

    .line 1712
    .line 1713
    .line 1714
    move-result v3

    .line 1715
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v3

    .line 1719
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v3

    .line 1723
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1724
    .line 1725
    .line 1726
    const-string v2, "getTouchSegmentDurationMillis = %s"

    .line 1727
    .line 1728
    iget-object v3, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1729
    .line 1730
    iget-object v3, v3, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1731
    .line 1732
    invoke-virtual {v3}, Lcom/quago/mobile/sdk/QuagoSettings;->getTouchSegmentDurationMillis()J

    .line 1733
    .line 1734
    .line 1735
    move-result-wide v3

    .line 1736
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v3

    .line 1740
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v3

    .line 1744
    invoke-virtual {v0, v10, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1745
    .line 1746
    .line 1747
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1748
    .line 1749
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1750
    .line 1751
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->isTouchSegmentDisabled()Z

    .line 1752
    .line 1753
    .line 1754
    move-result v0

    .line 1755
    if-nez v0, :cond_32

    .line 1756
    .line 1757
    iget-object v0, v1, Lcom/quago/mobile/sdk/n0;->a:Lcom/quago/mobile/sdk/o0;

    .line 1758
    .line 1759
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->d:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 1760
    .line 1761
    invoke-virtual {v0}, Lcom/quago/mobile/sdk/QuagoSettings;->getTouchSegmentDurationMillis()J

    .line 1762
    .line 1763
    .line 1764
    move-result-wide v2

    .line 1765
    invoke-virtual {v1, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5

    .line 1766
    .line 1767
    .line 1768
    goto :goto_19

    .line 1769
    :goto_16
    :try_start_d
    sget-object v1, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1770
    .line 1771
    invoke-virtual {v1, v10, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1772
    .line 1773
    .line 1774
    goto :goto_19

    .line 1775
    :cond_31
    :goto_17
    const-string v1, "QuagoMetaData failed to initialize!"

    .line 1776
    .line 1777
    new-array v2, v9, [Ljava/lang/Object;

    .line 1778
    .line 1779
    invoke-virtual {v0, v10, v1, v2}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    .line 1780
    .line 1781
    .line 1782
    return-void

    .line 1783
    :goto_18
    sget-object v1, Lcom/quago/mobile/sdk/o0;->H:Lcom/quago/mobile/sdk/j0;

    .line 1784
    .line 1785
    invoke-virtual {v1, v10, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1786
    .line 1787
    .line 1788
    :cond_32
    :goto_19
    return-void

    .line 1789
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_b
        :pswitch_a
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
