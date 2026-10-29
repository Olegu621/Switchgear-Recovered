.class final Lcom/google/android/recaptcha/internal/zzbn;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:Ljava/lang/Object;

.field zzc:I

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzbo;

.field private synthetic zze:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzbo;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzd:Lcom/google/android/recaptcha/internal/zzbo;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzbn;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzd:Lcom/google/android/recaptcha/internal/zzbo;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzbn;-><init>(Lcom/google/android/recaptcha/internal/zzbo;Lc10;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzbn;->zze:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzbn;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzbn;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzbn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzc:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v4, :cond_1

    .line 12
    .line 13
    if-eq v1, v3, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zze:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 23
    .line 24
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzb:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lcom/google/android/recaptcha/internal/zzbo;

    .line 32
    .line 33
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzbn;->zza:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Ldl1;

    .line 36
    .line 37
    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzbn;->zze:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v6, Lcom/google/android/recaptcha/internal/zzhk;

    .line 40
    .line 41
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object p1, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zze:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzd:Lcom/google/android/recaptcha/internal/zzbo;

    .line 54
    .line 55
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzbo;->zzg(Lcom/google/android/recaptcha/internal/zzbo;)Ldl1;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zze:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v6, p0, Lcom/google/android/recaptcha/internal/zzbn;->zza:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzb:Ljava/lang/Object;

    .line 64
    .line 65
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzc:I

    .line 66
    .line 67
    move-object v4, v6

    .line 68
    check-cast v4, Lgl1;

    .line 69
    .line 70
    invoke-virtual {v4, p0}, Lgl1;->d(Ld10;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    if-eq v6, v0, :cond_5

    .line 75
    .line 76
    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzbo;->zza(Lcom/google/android/recaptcha/internal/zzbo;)Lcom/google/android/recaptcha/internal/zzbp;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    sget-object v7, Lcom/google/android/recaptcha/internal/zzbp;->zza:Lcom/google/android/recaptcha/internal/zzbp;

    .line 81
    .line 82
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_3

    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    check-cast v4, Lgl1;

    .line 91
    .line 92
    invoke-virtual {v4, v5}, Lgl1;->g(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    goto :goto_3

    .line 98
    :cond_3
    :try_start_1
    sget-object v6, Lcom/google/android/recaptcha/internal/zzbp;->zzb:Lcom/google/android/recaptcha/internal/zzbp;

    .line 99
    .line 100
    invoke-static {v1, v6}, Lcom/google/android/recaptcha/internal/zzbo;->zzi(Lcom/google/android/recaptcha/internal/zzbo;Lcom/google/android/recaptcha/internal/zzbp;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    check-cast v4, Lgl1;

    .line 104
    .line 105
    invoke-virtual {v4, v5}, Lgl1;->g(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzd:Lcom/google/android/recaptcha/internal/zzbo;

    .line 109
    .line 110
    new-instance v4, Lkx;

    .line 111
    .line 112
    invoke-direct {v4}, Lkx;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object v4, v1, Lcom/google/android/recaptcha/internal/zzbo;->zza:Ljx;

    .line 116
    .line 117
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzbo;->zzb(Lcom/google/android/recaptcha/internal/zzbo;)Lcom/google/android/recaptcha/internal/zzcr;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-interface {v4}, Lcom/google/android/recaptcha/internal/zzcr;->zzc()Ly10;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    new-instance v6, Lcom/google/android/recaptcha/internal/zzbm;

    .line 126
    .line 127
    invoke-direct {v6, p1, v1, v5}, Lcom/google/android/recaptcha/internal/zzbm;-><init>(Lcom/google/android/recaptcha/internal/zzhk;Lcom/google/android/recaptcha/internal/zzbo;Lc10;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v4, v5, v6, v2}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbn;->zze:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zzbn;->zza:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzb:Ljava/lang/Object;

    .line 138
    .line 139
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzc:I

    .line 140
    .line 141
    new-instance v3, Lcom/google/android/recaptcha/internal/zzbj;

    .line 142
    .line 143
    invoke-direct {v3, v1, v5}, Lcom/google/android/recaptcha/internal/zzbj;-><init>(Lcom/google/android/recaptcha/internal/zzbo;Lc10;)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Lcom/google/android/recaptcha/internal/zzhg;

    .line 147
    .line 148
    invoke-direct {v1, v3}, Lcom/google/android/recaptcha/internal/zzhg;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    if-eq v1, v0, :cond_5

    .line 152
    .line 153
    move-object v8, v1

    .line 154
    move-object v1, p1

    .line 155
    move-object p1, v8

    .line 156
    :goto_1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhg;

    .line 157
    .line 158
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zzbn;->zze:Ljava/lang/Object;

    .line 159
    .line 160
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzbn;->zzc:I

    .line 161
    .line 162
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhg;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-ne p0, v0, :cond_4

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    :goto_3
    check-cast v4, Lgl1;

    .line 173
    .line 174
    invoke-virtual {v4, v5}, Lgl1;->g(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    throw p0

    .line 178
    :cond_5
    :goto_4
    return-object v0
.end method
