.class final Lcom/google/android/recaptcha/internal/zzgd;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:D

.field zzc:I

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzge;

.field final synthetic zze:J

.field private synthetic zzf:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzge;JLc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzd:Lcom/google/android/recaptcha/internal/zzge;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/google/android/recaptcha/internal/zzgd;->zze:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzgd;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzd:Lcom/google/android/recaptcha/internal/zzge;

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzgd;->zze:J

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/google/android/recaptcha/internal/zzgd;-><init>(Lcom/google/android/recaptcha/internal/zzge;JLc10;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzgd;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzgd;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzgd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzc:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    if-eq v1, v5, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-eq v1, v3, :cond_0

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :catch_0
    move-exception p1

    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 28
    .line 29
    :try_start_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_1 .. :try_end_1} :catch_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_1
    iget-wide v4, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzb:D

    .line 35
    .line 36
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 39
    .line 40
    :try_start_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_2 .. :try_end_2} :catch_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_2
    iget-wide v5, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzb:D

    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zza:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 50
    .line 51
    iget-object v7, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v7, Lcom/google/android/recaptcha/internal/zzhk;

    .line 54
    .line 55
    :try_start_3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_3 .. :try_end_3} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v1, p1

    .line 65
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 66
    .line 67
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzd:Lcom/google/android/recaptcha/internal/zzge;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzge;->zzc(Lcom/google/android/recaptcha/internal/zzge;)Lcom/google/android/recaptcha/internal/zzdv;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzdv;->zzb()Lcom/google/android/recaptcha/internal/zzds;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_7

    .line 82
    .line 83
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzge;->zzc(Lcom/google/android/recaptcha/internal/zzge;)Lcom/google/android/recaptcha/internal/zzdv;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzdv;->zza()Lcom/google/android/recaptcha/internal/zzdr;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    goto/16 :goto_6

    .line 98
    .line 99
    :cond_4
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzdv;->zzc()Lcom/google/android/recaptcha/internal/zzdt;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {p1, v6}, Lcom/google/android/recaptcha/internal/zzge;->zzg(Lcom/google/android/recaptcha/internal/zzge;Lcom/google/android/recaptcha/internal/zzdv;)V

    .line 104
    .line 105
    .line 106
    :try_start_4
    iget-wide v6, p0, Lcom/google/android/recaptcha/internal/zzgd;->zze:J

    .line 107
    .line 108
    long-to-double v6, v6

    .line 109
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzge;->zzd(Lcom/google/android/recaptcha/internal/zzge;)Lcom/google/android/recaptcha/internal/zzfp;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-wide v8, 0x3fe3333333333333L    # 0.6

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    mul-double/2addr v8, v6

    .line 119
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zza:Ljava/lang/Object;

    .line 122
    .line 123
    const-wide v10, 0x3fd999999999999aL    # 0.4

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    mul-double/2addr v6, v10

    .line 129
    iput-wide v6, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzb:D

    .line 130
    .line 131
    iput v5, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzc:I

    .line 132
    .line 133
    double-to-long v8, v8

    .line 134
    invoke-virtual {p1, v8, v9, p0}, Lcom/google/android/recaptcha/internal/zzfp;->zzp(JLc10;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eq p1, v0, :cond_6

    .line 139
    .line 140
    move-wide v5, v6

    .line 141
    move-object v7, v1

    .line 142
    :goto_0
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 143
    .line 144
    iput-object v7, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzgd;->zza:Ljava/lang/Object;

    .line 147
    .line 148
    iput-wide v5, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzb:D

    .line 149
    .line 150
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzc:I

    .line 151
    .line 152
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhf;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-eq p1, v0, :cond_6

    .line 157
    .line 158
    move-wide v4, v5

    .line 159
    move-object v1, v7

    .line 160
    :goto_1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzxn;

    .line 161
    .line 162
    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzd:Lcom/google/android/recaptcha/internal/zzge;

    .line 163
    .line 164
    invoke-static {v6, p1}, Lcom/google/android/recaptcha/internal/zzge;->zzf(Lcom/google/android/recaptcha/internal/zzge;Lcom/google/android/recaptcha/internal/zzxn;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v6}, Lcom/google/android/recaptcha/internal/zzge;->zzd(Lcom/google/android/recaptcha/internal/zzge;)Lcom/google/android/recaptcha/internal/zzfp;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    double-to-long v4, v4

    .line 172
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 173
    .line 174
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzc:I

    .line 175
    .line 176
    invoke-virtual {v6, p1, v4, v5, p0}, Lcom/google/android/recaptcha/internal/zzfp;->zzn(Lcom/google/android/recaptcha/internal/zzxn;JLc10;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-eq p1, v0, :cond_6

    .line 181
    .line 182
    :goto_2
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhg;

    .line 183
    .line 184
    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzf:Ljava/lang/Object;

    .line 185
    .line 186
    const/4 v2, 0x4

    .line 187
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzc:I

    .line 188
    .line 189
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhg;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-ne p1, v0, :cond_5

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_5
    :goto_3
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzd:Lcom/google/android/recaptcha/internal/zzge;

    .line 197
    .line 198
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzdv;->zzb()Lcom/google/android/recaptcha/internal/zzds;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {p1, v0}, Lcom/google/android/recaptcha/internal/zzge;->zzg(Lcom/google/android/recaptcha/internal/zzge;Lcom/google/android/recaptcha/internal/zzdv;)V
    :try_end_4
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_4 .. :try_end_4} :catch_0

    .line 203
    .line 204
    .line 205
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    :cond_6
    :goto_4
    return-object v0

    .line 209
    :goto_5
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzgd;->zzd:Lcom/google/android/recaptcha/internal/zzge;

    .line 210
    .line 211
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzdv;->zza()Lcom/google/android/recaptcha/internal/zzdr;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {p0, v0}, Lcom/google/android/recaptcha/internal/zzge;->zzg(Lcom/google/android/recaptcha/internal/zzge;Lcom/google/android/recaptcha/internal/zzdv;)V

    .line 216
    .line 217
    .line 218
    throw p1

    .line 219
    :cond_7
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0
.end method
