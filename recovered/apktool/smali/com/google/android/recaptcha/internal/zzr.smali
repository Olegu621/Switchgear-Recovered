.class final Lcom/google/android/recaptcha/internal/zzr;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzu;

.field final synthetic zzc:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzu;Ljava/lang/String;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzr;->zzb:Lcom/google/android/recaptcha/internal/zzu;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzr;->zzc:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1

    .line 1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzr;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzr;->zzb:Lcom/google/android/recaptcha/internal/zzu;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzr;->zzc:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzr;-><init>(Lcom/google/android/recaptcha/internal/zzu;Ljava/lang/String;Lc10;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzr;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzr;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzr;->zza:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :try_start_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :try_start_2
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzr;->zzb:Lcom/google/android/recaptcha/internal/zzu;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzu;->zzo(Lcom/google/android/recaptcha/internal/zzu;)Le70;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    move-object p1, v2

    .line 31
    :cond_2
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzr;->zza:I

    .line 32
    .line 33
    invoke-interface {p1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eq p1, v0, :cond_6

    .line 38
    .line 39
    :goto_0
    check-cast p1, Lcom/google/android/gms/recaptchabase/InitResult;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 40
    .line 41
    new-instance p1, Lcom/google/android/gms/recaptchabase/ExecuteRequest;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzr;->zzb:Lcom/google/android/recaptcha/internal/zzu;

    .line 47
    .line 48
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzu;->zzn(Lcom/google/android/recaptcha/internal/zzu;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    move-object v3, v2

    .line 55
    :cond_3
    iput-object v3, p1, Lcom/google/android/gms/recaptchabase/ExecuteRequest;->a:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzr;->zzc:Ljava/lang/String;

    .line 58
    .line 59
    iput-object v3, p1, Lcom/google/android/gms/recaptchabase/ExecuteRequest;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzu;->zzl(Lcom/google/android/recaptcha/internal/zzu;)Landroid/app/Application;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v3, Lcom/google/android/gms/internal/recaptchabase/zzl;

    .line 69
    .line 70
    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/recaptchabase/zzl;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    :try_start_3
    invoke-interface {v3, p1}, Lz02;->execute(Lcom/google/android/gms/recaptchabase/ExecuteRequest;)Lcom/google/android/gms/tasks/Task;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzdf;->zza(Lcom/google/android/gms/tasks/Task;)Le70;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const/4 v1, 0x2

    .line 82
    iput v1, p0, Lcom/google/android/recaptcha/internal/zzr;->zza:I

    .line 83
    .line 84
    invoke-interface {p1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    :goto_1
    check-cast p1, Lcom/google/android/gms/recaptchabase/ExecuteResult;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 92
    .line 93
    iget-object p1, p1, Lcom/google/android/gms/recaptchabase/ExecuteResult;->a:Ljava/lang/String;

    .line 94
    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzr;->zzc:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzxx;->zzf()Lcom/google/android/recaptcha/internal/zzxw;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0, p0}, Lcom/google/android/recaptcha/internal/zzxw;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzxw;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzxj;->zzf()Lcom/google/android/recaptcha/internal/zzxi;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzxi;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzxi;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzsh;->zzi()Lcom/google/android/recaptcha/internal/zzsn;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Lcom/google/android/recaptcha/internal/zzxj;

    .line 118
    .line 119
    invoke-virtual {v0, p0}, Lcom/google/android/recaptcha/internal/zzxw;->zzf(Lcom/google/android/recaptcha/internal/zzxj;)Lcom/google/android/recaptcha/internal/zzxw;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzsh;->zzi()Lcom/google/android/recaptcha/internal/zzsn;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Lcom/google/android/recaptcha/internal/zzxx;

    .line 127
    .line 128
    new-instance p1, Lo42;

    .line 129
    .line 130
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_5
    const-string p0, "Required value was null."

    .line 135
    .line 136
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v2

    .line 140
    :catch_0
    sget-object p0, Lo42;->b:Lm42;

    .line 141
    .line 142
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcg;

    .line 143
    .line 144
    sget-object v1, Lcom/google/android/recaptcha/internal/zzce;->zzb:Lcom/google/android/recaptcha/internal/zzce;

    .line 145
    .line 146
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcd;->zzau:Lcom/google/android/recaptcha/internal/zzcd;

    .line 147
    .line 148
    const/16 v5, 0xc

    .line 149
    .line 150
    const/4 v6, 0x0

    .line 151
    const/4 v3, 0x0

    .line 152
    const/4 v4, 0x0

    .line 153
    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzce;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 154
    .line 155
    .line 156
    new-instance p0, Ln42;

    .line 157
    .line 158
    invoke-direct {p0, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    new-instance p1, Lo42;

    .line 162
    .line 163
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    return-object p1

    .line 167
    :cond_6
    :goto_2
    return-object v0

    .line 168
    :catch_1
    sget-object p0, Lo42;->b:Lm42;

    .line 169
    .line 170
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcg;

    .line 171
    .line 172
    sget-object v1, Lcom/google/android/recaptcha/internal/zzce;->zzb:Lcom/google/android/recaptcha/internal/zzce;

    .line 173
    .line 174
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcd;->zzat:Lcom/google/android/recaptcha/internal/zzcd;

    .line 175
    .line 176
    const/16 v5, 0xc

    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    const/4 v3, 0x0

    .line 180
    const/4 v4, 0x0

    .line 181
    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzce;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 182
    .line 183
    .line 184
    new-instance p0, Ln42;

    .line 185
    .line 186
    invoke-direct {p0, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Lo42;

    .line 190
    .line 191
    invoke-direct {p1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-object p1
.end method
