.class public final Lcom/google/android/recaptcha/internal/zzgl;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/google/android/recaptcha/internal/zzgl;->zzb:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static final zza()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzgl;->zzb:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final zzb(Lcom/google/android/recaptcha/internal/zzwk;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzwa;)V
    .locals 6

    .line 1
    sget v0, Lcom/google/android/recaptcha/internal/zzby;->zza:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/recaptcha/internal/zzgi;->zza:Lcom/google/android/recaptcha/internal/zzgi;

    .line 4
    .line 5
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/google/android/recaptcha/internal/zzgj;->zza:Lcom/google/android/recaptcha/internal/zzgj;

    .line 10
    .line 11
    invoke-static {v1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lcom/google/android/recaptcha/internal/zzwk;->zzt(Lcom/google/android/recaptcha/internal/zzwa;)Lcom/google/android/recaptcha/internal/zzwk;

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object p2, Lcom/google/android/recaptcha/internal/zzgk;->zza:Lcom/google/android/recaptcha/internal/zzgk;

    .line 21
    .line 22
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lcom/google/android/recaptcha/internal/zzcc;

    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzcc;->zza()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lcom/google/android/recaptcha/internal/zzca;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {p0, v2}, Lcom/google/android/recaptcha/internal/zzwk;->zzq(I)Lcom/google/android/recaptcha/internal/zzwk;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzwk;->zzz()Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const-wide/16 v2, 0x3e8

    .line 62
    .line 63
    if-eqz p2, :cond_2

    .line 64
    .line 65
    sget p2, Lcom/google/android/recaptcha/internal/zzco;->zza:I

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzwk;->zze()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzwk;->zzf()J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    mul-long/2addr v4, v2

    .line 76
    add-int/lit16 p2, p2, 0x4e20

    .line 77
    .line 78
    invoke-static {p2, v4, v5}, Lcom/google/android/recaptcha/internal/zzco;->zza(IJ)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    sget p2, Lcom/google/android/recaptcha/internal/zzco;->zza:I

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzwk;->zzD()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzwk;->zzf()J

    .line 89
    .line 90
    .line 91
    move-result-wide v4

    .line 92
    mul-long/2addr v4, v2

    .line 93
    invoke-static {p2}, Lcom/google/android/recaptcha/internal/zzwl;->zza(I)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    add-int/lit16 p2, p2, 0x2710

    .line 98
    .line 99
    invoke-static {p2, v4, v5}, Lcom/google/android/recaptcha/internal/zzco;->zza(IJ)V

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Lcom/google/android/recaptcha/internal/zzgh;

    .line 107
    .line 108
    invoke-virtual {p2, p1}, Lcom/google/android/recaptcha/internal/zzgh;->zza(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzwz;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzwk;->zzv(Lcom/google/android/recaptcha/internal/zzwz;)Lcom/google/android/recaptcha/internal/zzwk;

    .line 113
    .line 114
    .line 115
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzzm;->zzi()Lcom/google/android/recaptcha/internal/zzzl;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1, p0}, Lcom/google/android/recaptcha/internal/zzzl;->zze(Lcom/google/android/recaptcha/internal/zzwk;)Lcom/google/android/recaptcha/internal/zzzl;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzsh;->zzi()Lcom/google/android/recaptcha/internal/zzsn;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Lcom/google/android/recaptcha/internal/zzzm;

    .line 127
    .line 128
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Lcom/google/android/recaptcha/internal/zzgs;

    .line 133
    .line 134
    invoke-interface {p1, p0}, Lcom/google/android/recaptcha/internal/zzgs;->zza(Lcom/google/android/recaptcha/internal/zzzm;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method
