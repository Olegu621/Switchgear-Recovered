.class final Lcom/google/android/recaptcha/internal/zzhw;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:I

.field final synthetic zzc:Lcom/google/android/recaptcha/internal/zzib;

.field final synthetic zzd:Ljava/lang/String;

.field final synthetic zze:Ljava/lang/String;

.field private synthetic zzf:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzib;Ljava/lang/String;Ljava/lang/String;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzc:Lcom/google/android/recaptcha/internal/zzib;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzd:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzhw;->zze:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzhw;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzc:Lcom/google/android/recaptcha/internal/zzib;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzd:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzhw;->zze:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Lcom/google/android/recaptcha/internal/zzhw;-><init>(Lcom/google/android/recaptcha/internal/zzib;Ljava/lang/String;Ljava/lang/String;Lc10;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzhw;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzhw;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzhw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzb:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    if-eq v1, v6, :cond_4

    .line 14
    .line 15
    if-eq v1, v5, :cond_3

    .line 16
    .line 17
    if-eq v1, v4, :cond_2

    .line 18
    .line 19
    if-eq v1, v3, :cond_1

    .line 20
    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 47
    .line 48
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_2
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 56
    .line 57
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Lcom/google/android/recaptcha/internal/zzhk;

    .line 60
    .line 61
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 69
    .line 70
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 77
    .line 78
    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, Lcom/google/android/recaptcha/internal/zzhk;

    .line 81
    .line 82
    :try_start_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    .line 85
    move-object v9, v6

    .line 86
    move-object v6, v1

    .line 87
    move-object v1, v9

    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-object v1, v6

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v1, p1

    .line 97
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 98
    .line 99
    :try_start_2
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzc:Lcom/google/android/recaptcha/internal/zzib;

    .line 100
    .line 101
    iget-object v8, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzd:Ljava/lang/String;

    .line 102
    .line 103
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 106
    .line 107
    iput v6, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzb:I

    .line 108
    .line 109
    new-instance v6, Lcom/google/android/recaptcha/internal/zzhx;

    .line 110
    .line 111
    invoke-direct {v6, p1, v8, v7}, Lcom/google/android/recaptcha/internal/zzhx;-><init>(Lcom/google/android/recaptcha/internal/zzib;Ljava/lang/String;Lc10;)V

    .line 112
    .line 113
    .line 114
    new-instance p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 115
    .line 116
    const/16 v8, 0x19

    .line 117
    .line 118
    invoke-direct {p1, v8, v6, v7}, Lcom/google/android/recaptcha/internal/zzhf;-><init>(ILkotlin/jvm/functions/Function2;Ljava/lang/Integer;)V

    .line 119
    .line 120
    .line 121
    if-eq p1, v0, :cond_6

    .line 122
    .line 123
    move-object v6, v1

    .line 124
    :goto_0
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 125
    .line 126
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v7, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 129
    .line 130
    iput v5, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzb:I

    .line 131
    .line 132
    invoke-virtual {p1, v6, p0}, Lcom/google/android/recaptcha/internal/zzhf;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eq p1, v0, :cond_6

    .line 137
    .line 138
    :goto_1
    check-cast p1, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 139
    .line 140
    return-object p1

    .line 141
    :catch_1
    :goto_2
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzc:Lcom/google/android/recaptcha/internal/zzib;

    .line 142
    .line 143
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzib;->zza(Lcom/google/android/recaptcha/internal/zzib;)Lcom/google/android/recaptcha/internal/zzbt;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-interface {v5}, Lcom/google/android/recaptcha/internal/zzbt;->zzb()V

    .line 148
    .line 149
    .line 150
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzhw;->zze:Ljava/lang/String;

    .line 151
    .line 152
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 155
    .line 156
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzb:I

    .line 157
    .line 158
    new-instance v4, Lcom/google/android/recaptcha/internal/zzhu;

    .line 159
    .line 160
    invoke-direct {v4, p1, v5, v7}, Lcom/google/android/recaptcha/internal/zzhu;-><init>(Lcom/google/android/recaptcha/internal/zzib;Ljava/lang/String;Lc10;)V

    .line 161
    .line 162
    .line 163
    new-instance p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 164
    .line 165
    const/16 v5, 0x17

    .line 166
    .line 167
    invoke-direct {p1, v5, v4, v7}, Lcom/google/android/recaptcha/internal/zzhf;-><init>(ILkotlin/jvm/functions/Function2;Ljava/lang/Integer;)V

    .line 168
    .line 169
    .line 170
    if-eq p1, v0, :cond_6

    .line 171
    .line 172
    move-object v4, v1

    .line 173
    :goto_3
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 174
    .line 175
    iput-object v4, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v7, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 178
    .line 179
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzb:I

    .line 180
    .line 181
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhf;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-eq p1, v0, :cond_6

    .line 186
    .line 187
    move-object v1, v4

    .line 188
    :goto_4
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzc:Lcom/google/android/recaptcha/internal/zzib;

    .line 189
    .line 190
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzd:Ljava/lang/String;

    .line 191
    .line 192
    check-cast p1, Ljava/lang/String;

    .line 193
    .line 194
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 197
    .line 198
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzb:I

    .line 199
    .line 200
    new-instance v2, Lcom/google/android/recaptcha/internal/zzhy;

    .line 201
    .line 202
    invoke-direct {v2, v3, v4, p1, v7}, Lcom/google/android/recaptcha/internal/zzhy;-><init>(Lcom/google/android/recaptcha/internal/zzib;Ljava/lang/String;Ljava/lang/String;Lc10;)V

    .line 203
    .line 204
    .line 205
    new-instance v3, Lcom/google/android/recaptcha/internal/zzhf;

    .line 206
    .line 207
    const/16 v4, 0x18

    .line 208
    .line 209
    invoke-direct {v3, v4, v2, v7}, Lcom/google/android/recaptcha/internal/zzhf;-><init>(ILkotlin/jvm/functions/Function2;Ljava/lang/Integer;)V

    .line 210
    .line 211
    .line 212
    if-eq v3, v0, :cond_6

    .line 213
    .line 214
    move-object v2, p1

    .line 215
    move-object p1, v3

    .line 216
    :goto_5
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 217
    .line 218
    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzf:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v7, p0, Lcom/google/android/recaptcha/internal/zzhw;->zza:Ljava/lang/Object;

    .line 221
    .line 222
    const/4 v3, 0x6

    .line 223
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzhw;->zzb:I

    .line 224
    .line 225
    invoke-static {v1, p1, p0}, Lcom/google/android/recaptcha/internal/zzhj;->zzb(Lcom/google/android/recaptcha/internal/zzhk;Lcom/google/android/recaptcha/internal/zzhf;Lc10;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    if-eq p0, v0, :cond_6

    .line 230
    .line 231
    return-object v2

    .line 232
    :cond_6
    return-object v0
.end method
