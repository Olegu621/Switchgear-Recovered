.class final Lcom/google/android/gms/internal/drive/zzlf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/drive/zzmg;


# static fields
.field private static final zzts:Lcom/google/android/gms/internal/drive/zzlp;


# instance fields
.field private final zztr:Lcom/google/android/gms/internal/drive/zzlp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzlg;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzlg;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzlf;->zzts:Lcom/google/android/gms/internal/drive/zzlp;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzlh;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkj;->zzcv()Lcom/google/android/gms/internal/drive/zzkj;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzlf;->zzdv()Lcom/google/android/gms/internal/drive/zzlp;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x2

    .line 12
    new-array v3, v3, [Lcom/google/android/gms/internal/drive/zzlp;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object v1, v3, v4

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object v2, v3, v1

    .line 19
    .line 20
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/drive/zzlh;-><init>([Lcom/google/android/gms/internal/drive/zzlp;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/drive/zzlf;-><init>(Lcom/google/android/gms/internal/drive/zzlp;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/drive/zzlp;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/drive/zzkm;->zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/drive/zzlp;

    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzlf;->zztr:Lcom/google/android/gms/internal/drive/zzlp;

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/drive/zzlo;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/drive/zzlo;->zzec()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget v0, Lcom/google/android/gms/internal/drive/zzkk$zze;->zzsf:I

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private static zzdv()Lcom/google/android/gms/internal/drive/zzlp;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getInstance"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/google/android/gms/internal/drive/zzlp;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :catch_0
    sget-object v0, Lcom/google/android/gms/internal/drive/zzlf;->zzts:Lcom/google/android/gms/internal/drive/zzlp;

    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public final zze(Ljava/lang/Class;)Lcom/google/android/gms/internal/drive/zzmf;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/drive/zzmf<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(Ljava/lang/Class;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlf;->zztr:Lcom/google/android/gms/internal/drive/zzlp;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/drive/zzlp;->zzc(Ljava/lang/Class;)Lcom/google/android/gms/internal/drive/zzlo;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Lcom/google/android/gms/internal/drive/zzlo;->zzed()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const-class v0, Lcom/google/android/gms/internal/drive/zzkk;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmh;->zzeo()Lcom/google/android/gms/internal/drive/zzmx;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzka;->zzcl()Lcom/google/android/gms/internal/drive/zzjy;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {v1}, Lcom/google/android/gms/internal/drive/zzlo;->zzee()Lcom/google/android/gms/internal/drive/zzlq;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlw;->zza(Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzlq;)Lcom/google/android/gms/internal/drive/zzlw;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmh;->zzem()Lcom/google/android/gms/internal/drive/zzmx;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzka;->zzcm()Lcom/google/android/gms/internal/drive/zzjy;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {v1}, Lcom/google/android/gms/internal/drive/zzlo;->zzee()Lcom/google/android/gms/internal/drive/zzlq;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlw;->zza(Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzlq;)Lcom/google/android/gms/internal/drive/zzlw;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzlf;->zza(Lcom/google/android/gms/internal/drive/zzlo;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzma;->zzeh()Lcom/google/android/gms/internal/drive/zzly;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzla;->zzdu()Lcom/google/android/gms/internal/drive/zzla;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmh;->zzeo()Lcom/google/android/gms/internal/drive/zzmx;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzka;->zzcl()Lcom/google/android/gms/internal/drive/zzjy;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzln;->zzea()Lcom/google/android/gms/internal/drive/zzll;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    move-object v0, p1

    .line 91
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zzlo;Lcom/google/android/gms/internal/drive/zzly;Lcom/google/android/gms/internal/drive/zzla;Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzll;)Lcom/google/android/gms/internal/drive/zzlu;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_2
    move-object v0, p1

    .line 97
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzma;->zzeh()Lcom/google/android/gms/internal/drive/zzly;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzla;->zzdu()Lcom/google/android/gms/internal/drive/zzla;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmh;->zzeo()Lcom/google/android/gms/internal/drive/zzmx;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    const/4 v5, 0x0

    .line 110
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzln;->zzea()Lcom/google/android/gms/internal/drive/zzll;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zzlo;Lcom/google/android/gms/internal/drive/zzly;Lcom/google/android/gms/internal/drive/zzla;Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzll;)Lcom/google/android/gms/internal/drive/zzlu;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :cond_3
    move-object v0, p1

    .line 120
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzlf;->zza(Lcom/google/android/gms/internal/drive/zzlo;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_4

    .line 125
    .line 126
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzma;->zzeg()Lcom/google/android/gms/internal/drive/zzly;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzla;->zzdt()Lcom/google/android/gms/internal/drive/zzla;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmh;->zzem()Lcom/google/android/gms/internal/drive/zzmx;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzka;->zzcm()Lcom/google/android/gms/internal/drive/zzjy;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzln;->zzdz()Lcom/google/android/gms/internal/drive/zzll;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zzlo;Lcom/google/android/gms/internal/drive/zzly;Lcom/google/android/gms/internal/drive/zzla;Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzll;)Lcom/google/android/gms/internal/drive/zzlu;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzma;->zzeg()Lcom/google/android/gms/internal/drive/zzly;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzla;->zzdt()Lcom/google/android/gms/internal/drive/zzla;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmh;->zzen()Lcom/google/android/gms/internal/drive/zzmx;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    const/4 v5, 0x0

    .line 164
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzln;->zzdz()Lcom/google/android/gms/internal/drive/zzll;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zzlo;Lcom/google/android/gms/internal/drive/zzly;Lcom/google/android/gms/internal/drive/zzla;Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzll;)Lcom/google/android/gms/internal/drive/zzlu;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0
.end method
