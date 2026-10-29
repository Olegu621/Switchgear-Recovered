.class final Lcom/google/android/recaptcha/internal/zzb;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzg;

.field final synthetic zzc:Ljava/lang/String;

.field final synthetic zzd:J

.field private synthetic zze:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzg;Ljava/lang/String;JLc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzb;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzb;->zzc:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/google/android/recaptcha/internal/zzb;->zzd:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzb;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzb;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzb;->zzc:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzb;->zzd:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzb;-><init>(Lcom/google/android/recaptcha/internal/zzg;Ljava/lang/String;JLc10;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzb;->zze:Ljava/lang/Object;

    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzb;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzb;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzb;->zza:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzb;->zze:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 25
    .line 26
    :try_start_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzb;->zze:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 37
    .line 38
    :try_start_2
    iget-object v8, p0, Lcom/google/android/recaptcha/internal/zzb;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 39
    .line 40
    iget-object v9, p0, Lcom/google/android/recaptcha/internal/zzb;->zzc:Ljava/lang/String;

    .line 41
    .line 42
    iget-wide v6, p0, Lcom/google/android/recaptcha/internal/zzb;->zzd:J

    .line 43
    .line 44
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzb;->zze:Ljava/lang/Object;

    .line 45
    .line 46
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzb;->zza:I

    .line 47
    .line 48
    invoke-virtual {v8}, Lcom/google/android/recaptcha/internal/zzg;->zzj()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    new-instance v5, Lcom/google/android/recaptcha/internal/zzf;

    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    invoke-direct/range {v5 .. v10}, Lcom/google/android/recaptcha/internal/zzf;-><init>(JLcom/google/android/recaptcha/internal/zzg;Ljava/lang/String;Lc10;)V

    .line 56
    .line 57
    .line 58
    new-instance v3, Lcom/google/android/recaptcha/internal/zzhf;

    .line 59
    .line 60
    invoke-direct {v3, p1, v5, v4}, Lcom/google/android/recaptcha/internal/zzhf;-><init>(ILkotlin/jvm/functions/Function2;Ljava/lang/Integer;)V

    .line 61
    .line 62
    .line 63
    if-eq v3, v0, :cond_3

    .line 64
    .line 65
    move-object p1, v3

    .line 66
    :goto_0
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 67
    .line 68
    iput-object v4, p0, Lcom/google/android/recaptcha/internal/zzb;->zze:Ljava/lang/Object;

    .line 69
    .line 70
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzb;->zza:I

    .line 71
    .line 72
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhf;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eq p1, v0, :cond_3

    .line 77
    .line 78
    :goto_1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzxx;

    .line 79
    .line 80
    sget-object p0, Lo42;->b:Lm42;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :catch_0
    sget-object p1, Lo42;->b:Lm42;

    .line 84
    .line 85
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzb;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 86
    .line 87
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzb;->zzc:Ljava/lang/String;

    .line 88
    .line 89
    iput-object v4, p0, Lcom/google/android/recaptcha/internal/zzb;->zze:Ljava/lang/Object;

    .line 90
    .line 91
    const/4 v2, 0x3

    .line 92
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzb;->zza:I

    .line 93
    .line 94
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzg;->zza(Ljava/lang/String;Lc10;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v0, :cond_4

    .line 99
    .line 100
    :cond_3
    return-object v0

    .line 101
    :cond_4
    :goto_2
    sget-object p0, Lo42;->b:Lm42;

    .line 102
    .line 103
    :goto_3
    new-instance p0, Lo42;

    .line 104
    .line 105
    invoke-direct {p0, p1}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object p0
.end method
