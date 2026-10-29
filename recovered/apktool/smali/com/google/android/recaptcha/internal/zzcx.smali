.class public final Lcom/google/android/recaptcha/internal/zzcx;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzcx;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcx;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzcx;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/recaptcha/internal/zzcx;->zza:Lcom/google/android/recaptcha/internal/zzcx;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final zzc(JIJJDLkotlin/jvm/functions/Function1;Lc10;)Ljava/lang/Object;
    .locals 10

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcw;

    .line 2
    .line 3
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    const-wide/16 v2, 0x64

    .line 9
    .line 10
    const-wide/16 v4, 0x3e8

    .line 11
    .line 12
    move-object/from16 v8, p9

    .line 13
    .line 14
    invoke-direct/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzcw;-><init>(IJJDLkotlin/jvm/functions/Function1;Lc10;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 p2, p10

    .line 18
    .line 19
    invoke-static {p0, p1, v0, p2}, Lqj3;->Q(JLkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final zza(IJJDLkotlin/jvm/functions/Function1;Lc10;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzcu;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/google/android/recaptcha/internal/zzcu;

    .line 9
    .line 10
    iget v2, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzh:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzh:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/google/android/recaptcha/internal/zzcu;

    .line 23
    .line 24
    move-object/from16 v2, p0

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lcom/google/android/recaptcha/internal/zzcu;-><init>(Lcom/google/android/recaptcha/internal/zzcx;Lc10;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzf:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, Lz10;->a:Lz10;

    .line 32
    .line 33
    iget v3, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzh:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x3

    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    if-eq v3, v7, :cond_3

    .line 42
    .line 43
    if-eq v3, v6, :cond_2

    .line 44
    .line 45
    if-ne v3, v5, :cond_1

    .line 46
    .line 47
    invoke-static {v0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v4

    .line 57
    :cond_2
    iget v3, v1, Lcom/google/android/recaptcha/internal/zzcu;->zze:I

    .line 58
    .line 59
    iget v8, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzd:I

    .line 60
    .line 61
    iget-wide v9, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzb:D

    .line 62
    .line 63
    iget-wide v11, v1, Lcom/google/android/recaptcha/internal/zzcu;->zza:J

    .line 64
    .line 65
    iget-object v13, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzi:Lg22;

    .line 66
    .line 67
    iget-object v14, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzc:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 70
    .line 71
    invoke-static {v0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    move-wide v15, v11

    .line 75
    move-object v11, v1

    .line 76
    move-wide v0, v15

    .line 77
    move v4, v3

    .line 78
    move v12, v8

    .line 79
    move-wide v8, v9

    .line 80
    move-object v10, v13

    .line 81
    move-object v3, v14

    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_3
    iget v3, v1, Lcom/google/android/recaptcha/internal/zzcu;->zze:I

    .line 85
    .line 86
    iget v8, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzd:I

    .line 87
    .line 88
    iget-wide v9, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzb:D

    .line 89
    .line 90
    iget-wide v11, v1, Lcom/google/android/recaptcha/internal/zzcu;->zza:J

    .line 91
    .line 92
    iget-object v13, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzi:Lg22;

    .line 93
    .line 94
    iget-object v14, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzc:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    :try_start_0
    invoke-static {v0}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_4
    invoke-static {v0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lg22;

    .line 106
    .line 107
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    move-wide/from16 v8, p2

    .line 111
    .line 112
    iput-wide v8, v0, Lg22;->a:J

    .line 113
    .line 114
    add-int/lit8 v3, p1, -0x1

    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    move-object v10, v0

    .line 118
    move-object v11, v1

    .line 119
    move v12, v3

    .line 120
    move v13, v8

    .line 121
    move-wide/from16 v0, p4

    .line 122
    .line 123
    move-wide/from16 v8, p6

    .line 124
    .line 125
    move-object/from16 v3, p8

    .line 126
    .line 127
    :goto_2
    if-ge v13, v12, :cond_7

    .line 128
    .line 129
    :try_start_1
    iput-object v3, v11, Lcom/google/android/recaptcha/internal/zzcu;->zzc:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v10, v11, Lcom/google/android/recaptcha/internal/zzcu;->zzi:Lg22;

    .line 132
    .line 133
    iput-wide v0, v11, Lcom/google/android/recaptcha/internal/zzcu;->zza:J

    .line 134
    .line 135
    iput-wide v8, v11, Lcom/google/android/recaptcha/internal/zzcu;->zzb:D

    .line 136
    .line 137
    iput v12, v11, Lcom/google/android/recaptcha/internal/zzcu;->zzd:I

    .line 138
    .line 139
    iput v13, v11, Lcom/google/android/recaptcha/internal/zzcu;->zze:I

    .line 140
    .line 141
    iput v7, v11, Lcom/google/android/recaptcha/internal/zzcu;->zzh:I

    .line 142
    .line 143
    invoke-interface {v3, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 147
    if-ne v0, v2, :cond_5

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_5
    return-object v0

    .line 151
    :catch_0
    move-object v14, v3

    .line 152
    move v3, v13

    .line 153
    move-object v13, v10

    .line 154
    move-wide v9, v8

    .line 155
    move v8, v12

    .line 156
    move-wide v15, v0

    .line 157
    move-object v1, v11

    .line 158
    move-wide v11, v15

    .line 159
    :catch_1
    iget-wide v4, v13, Lg22;->a:J

    .line 160
    .line 161
    long-to-double v4, v4

    .line 162
    mul-double/2addr v4, v9

    .line 163
    double-to-long v4, v4

    .line 164
    cmp-long v0, v4, v11

    .line 165
    .line 166
    if-lez v0, :cond_6

    .line 167
    .line 168
    move-wide v4, v11

    .line 169
    :cond_6
    iput-wide v4, v13, Lg22;->a:J

    .line 170
    .line 171
    iput-object v14, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzc:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v13, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzi:Lg22;

    .line 174
    .line 175
    iput-wide v11, v1, Lcom/google/android/recaptcha/internal/zzcu;->zza:J

    .line 176
    .line 177
    iput-wide v9, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzb:D

    .line 178
    .line 179
    iput v8, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzd:I

    .line 180
    .line 181
    iput v3, v1, Lcom/google/android/recaptcha/internal/zzcu;->zze:I

    .line 182
    .line 183
    iput v6, v1, Lcom/google/android/recaptcha/internal/zzcu;->zzh:I

    .line 184
    .line 185
    invoke-static {v4, v5, v1}, Lw11;->h(JLd10;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eq v0, v2, :cond_8

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :goto_3
    add-int/lit8 v13, v4, 0x1

    .line 193
    .line 194
    const/4 v4, 0x0

    .line 195
    const/4 v5, 0x3

    .line 196
    goto :goto_2

    .line 197
    :cond_7
    move-object v0, v4

    .line 198
    iput-object v0, v11, Lcom/google/android/recaptcha/internal/zzcu;->zzc:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v0, v11, Lcom/google/android/recaptcha/internal/zzcu;->zzi:Lg22;

    .line 201
    .line 202
    const/4 v0, 0x3

    .line 203
    iput v0, v11, Lcom/google/android/recaptcha/internal/zzcu;->zzh:I

    .line 204
    .line 205
    invoke-interface {v3, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-eq v0, v2, :cond_8

    .line 210
    .line 211
    return-object v0

    .line 212
    :cond_8
    :goto_4
    return-object v2
.end method

.method public final zzb(Lkotlin/jvm/functions/Function1;JJDLkotlin/jvm/functions/Function1;Lc10;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzcv;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/google/android/recaptcha/internal/zzcv;

    .line 9
    .line 10
    iget v2, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzh:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzh:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/google/android/recaptcha/internal/zzcv;

    .line 23
    .line 24
    move-object/from16 v2, p0

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lcom/google/android/recaptcha/internal/zzcv;-><init>(Lcom/google/android/recaptcha/internal/zzcx;Lc10;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzf:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, Lz10;->a:Lz10;

    .line 32
    .line 33
    iget v3, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzh:I

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    if-eq v3, v5, :cond_2

    .line 40
    .line 41
    if-ne v3, v4, :cond_1

    .line 42
    .line 43
    iget-wide v6, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzd:J

    .line 44
    .line 45
    iget-wide v8, v1, Lcom/google/android/recaptcha/internal/zzcv;->zze:D

    .line 46
    .line 47
    iget-wide v10, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzc:J

    .line 48
    .line 49
    iget-object v3, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzb:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    iget-object v12, v1, Lcom/google/android/recaptcha/internal/zzcv;->zza:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    invoke-static {v0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    move-object v14, v12

    .line 61
    move-object v12, v1

    .line 62
    move-object v1, v14

    .line 63
    move-wide v14, v10

    .line 64
    move-wide v10, v8

    .line 65
    move-wide v8, v14

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    return-object v0

    .line 74
    :cond_2
    iget-wide v6, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzd:J

    .line 75
    .line 76
    iget-wide v8, v1, Lcom/google/android/recaptcha/internal/zzcv;->zze:D

    .line 77
    .line 78
    iget-wide v10, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzc:J

    .line 79
    .line 80
    iget-object v3, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzb:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    iget-object v12, v1, Lcom/google/android/recaptcha/internal/zzcv;->zza:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 87
    .line 88
    :try_start_0
    invoke-static {v0}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :catch_0
    move-exception v0

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    invoke-static {v0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-wide/from16 v6, p2

    .line 98
    .line 99
    move-wide/from16 v8, p4

    .line 100
    .line 101
    move-wide/from16 v10, p6

    .line 102
    .line 103
    move-object/from16 v3, p8

    .line 104
    .line 105
    move-object v12, v1

    .line 106
    move-object/from16 v1, p1

    .line 107
    .line 108
    :goto_2
    :try_start_1
    iput-object v1, v12, Lcom/google/android/recaptcha/internal/zzcv;->zza:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v3, v12, Lcom/google/android/recaptcha/internal/zzcv;->zzb:Ljava/lang/Object;

    .line 111
    .line 112
    iput-wide v8, v12, Lcom/google/android/recaptcha/internal/zzcv;->zzc:J

    .line 113
    .line 114
    iput-wide v10, v12, Lcom/google/android/recaptcha/internal/zzcv;->zze:D

    .line 115
    .line 116
    iput-wide v6, v12, Lcom/google/android/recaptcha/internal/zzcv;->zzd:J

    .line 117
    .line 118
    iput v5, v12, Lcom/google/android/recaptcha/internal/zzcv;->zzh:I

    .line 119
    .line 120
    invoke-interface {v3, v12}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 124
    if-ne v0, v2, :cond_4

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_4
    return-object v0

    .line 128
    :catch_1
    move-exception v0

    .line 129
    move-object v14, v12

    .line 130
    move-object v12, v1

    .line 131
    move-object v1, v14

    .line 132
    move-wide v14, v10

    .line 133
    move-wide v10, v8

    .line 134
    move-wide v8, v14

    .line 135
    :goto_3
    invoke-interface {v12, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    check-cast v13, Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    if-eqz v13, :cond_7

    .line 146
    .line 147
    long-to-double v6, v6

    .line 148
    mul-double/2addr v6, v8

    .line 149
    double-to-long v6, v6

    .line 150
    cmp-long v0, v6, v10

    .line 151
    .line 152
    if-lez v0, :cond_5

    .line 153
    .line 154
    move-wide v6, v10

    .line 155
    :cond_5
    iput-object v12, v1, Lcom/google/android/recaptcha/internal/zzcv;->zza:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v3, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzb:Ljava/lang/Object;

    .line 158
    .line 159
    iput-wide v10, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzc:J

    .line 160
    .line 161
    iput-wide v8, v1, Lcom/google/android/recaptcha/internal/zzcv;->zze:D

    .line 162
    .line 163
    iput-wide v6, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzd:J

    .line 164
    .line 165
    iput v4, v1, Lcom/google/android/recaptcha/internal/zzcv;->zzh:I

    .line 166
    .line 167
    invoke-static {v6, v7, v1}, Lw11;->h(JLd10;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-eq v0, v2, :cond_6

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_6
    :goto_4
    return-object v2

    .line 175
    :cond_7
    throw v0
.end method
