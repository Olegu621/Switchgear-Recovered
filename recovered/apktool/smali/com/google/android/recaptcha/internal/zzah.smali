.class final Lcom/google/android/recaptcha/internal/zzah;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:Ljava/lang/Object;

.field zzc:Ljava/lang/Object;

.field zzd:I

.field final synthetic zze:Lcom/google/android/recaptcha/internal/zzxn;

.field final synthetic zzf:Lcom/google/android/recaptcha/internal/zzaj;

.field final synthetic zzg:Lcom/google/android/recaptcha/internal/zzhk;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzxn;Lcom/google/android/recaptcha/internal/zzaj;Lcom/google/android/recaptcha/internal/zzhk;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzah;->zze:Lcom/google/android/recaptcha/internal/zzxn;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzah;->zzf:Lcom/google/android/recaptcha/internal/zzaj;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzah;->zzg:Lcom/google/android/recaptcha/internal/zzhk;

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
    .locals 2

    .line 1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzah;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzah;->zze:Lcom/google/android/recaptcha/internal/zzxn;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzah;->zzf:Lcom/google/android/recaptcha/internal/zzaj;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzah;->zzg:Lcom/google/android/recaptcha/internal/zzhk;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p0, p2}, Lcom/google/android/recaptcha/internal/zzah;-><init>(Lcom/google/android/recaptcha/internal/zzxn;Lcom/google/android/recaptcha/internal/zzaj;Lcom/google/android/recaptcha/internal/zzhk;Lc10;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ly10;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzah;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzah;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzah;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzah;->zzd:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzah;->zzb:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/Iterator;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzah;->zza:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lcom/google/android/recaptcha/internal/zzxp;

    .line 17
    .line 18
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzah;->zzc:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzah;->zzb:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Ljava/util/Iterator;

    .line 29
    .line 30
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzah;->zza:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Lcom/google/android/recaptcha/internal/zzxp;

    .line 33
    .line 34
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzah;->zze:Lcom/google/android/recaptcha/internal/zzxn;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzxn;->zzU()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    sget-object p0, Lo42;->b:Lm42;

    .line 51
    .line 52
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcg;

    .line 53
    .line 54
    sget-object v1, Lcom/google/android/recaptcha/internal/zzce;->zzb:Lcom/google/android/recaptcha/internal/zzce;

    .line 55
    .line 56
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcd;->zzab:Lcom/google/android/recaptcha/internal/zzcd;

    .line 57
    .line 58
    const/16 v5, 0xc

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v3, 0x0

    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzce;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Ln42;

    .line 67
    .line 68
    invoke-direct {p0, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Lo42;

    .line 72
    .line 73
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzxn;->zzk()Lcom/google/android/recaptcha/internal/zzxp;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzxp;->zzi()Lcom/google/android/recaptcha/internal/zzqm;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzqm;->zzn()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    sget-object p0, Lo42;->b:Lm42;

    .line 92
    .line 93
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcg;

    .line 94
    .line 95
    sget-object v1, Lcom/google/android/recaptcha/internal/zzce;->zzb:Lcom/google/android/recaptcha/internal/zzce;

    .line 96
    .line 97
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcd;->zzab:Lcom/google/android/recaptcha/internal/zzcd;

    .line 98
    .line 99
    const/16 v5, 0xc

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    const/4 v4, 0x0

    .line 104
    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzce;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    .line 107
    new-instance p0, Ln42;

    .line 108
    .line 109
    invoke-direct {p0, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    new-instance p1, Lo42;

    .line 113
    .line 114
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_3
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzah;->zzf:Lcom/google/android/recaptcha/internal/zzaj;

    .line 119
    .line 120
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzxp;->zzi()Lcom/google/android/recaptcha/internal/zzqm;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {p1, v1}, Lcom/google/android/recaptcha/internal/zzaj;->zzo(Lcom/google/android/recaptcha/internal/zzaj;Lcom/google/android/recaptcha/internal/zzqm;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzaj;->zzm(Lcom/google/android/recaptcha/internal/zzaj;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_5

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Lcom/google/android/recaptcha/internal/zzar;

    .line 146
    .line 147
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzah;->zzg:Lcom/google/android/recaptcha/internal/zzhk;

    .line 148
    .line 149
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzah;->zza:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzah;->zzb:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v4, p0, Lcom/google/android/recaptcha/internal/zzah;->zzc:Ljava/lang/Object;

    .line 154
    .line 155
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzah;->zzd:I

    .line 156
    .line 157
    invoke-interface {p1, v3, p0}, Lcom/google/android/recaptcha/internal/zzar;->zzd(Lcom/google/android/recaptcha/internal/zzxp;Lc10;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-eq p1, v0, :cond_4

    .line 162
    .line 163
    move-object v7, v3

    .line 164
    move-object v3, v1

    .line 165
    move-object v1, v4

    .line 166
    move-object v4, v7

    .line 167
    :goto_1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 168
    .line 169
    iput-object v4, p0, Lcom/google/android/recaptcha/internal/zzah;->zza:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzah;->zzb:Ljava/lang/Object;

    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zzah;->zzc:Ljava/lang/Object;

    .line 175
    .line 176
    const/4 v5, 0x2

    .line 177
    iput v5, p0, Lcom/google/android/recaptcha/internal/zzah;->zzd:I

    .line 178
    .line 179
    invoke-static {v1, p1, p0}, Lcom/google/android/recaptcha/internal/zzhj;->zzb(Lcom/google/android/recaptcha/internal/zzhk;Lcom/google/android/recaptcha/internal/zzhf;Lc10;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-eq p1, v0, :cond_4

    .line 184
    .line 185
    move-object v1, v3

    .line 186
    move-object v3, v4

    .line 187
    goto :goto_0

    .line 188
    :cond_4
    return-object v0

    .line 189
    :cond_5
    sget-object p0, Lo42;->b:Lm42;

    .line 190
    .line 191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    new-instance p1, Lo42;

    .line 194
    .line 195
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    return-object p1
.end method
