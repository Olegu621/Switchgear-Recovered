.class public Lcom/google/android/gms/drive/query/internal/FilterHolder;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/drive/query/internal/FilterHolder;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final U:Lcom/google/android/gms/drive/query/Filter;

.field public final a:Lcom/google/android/gms/drive/query/internal/zzb;

.field public final b:Lcom/google/android/gms/drive/query/internal/zzd;

.field public final c:Lcom/google/android/gms/drive/query/internal/zzr;

.field public final d:Lcom/google/android/gms/drive/query/internal/zzv;

.field public final e:Lcom/google/android/gms/drive/query/internal/zzp;

.field public final f:Lcom/google/android/gms/drive/query/internal/zzt;

.field public final i:Lcom/google/android/gms/drive/query/internal/zzn;

.field public final v:Lcom/google/android/gms/drive/query/internal/zzl;

.field public final w:Lcom/google/android/gms/drive/query/internal/zzz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltf3;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ltf3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/query/Filter;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null filter."

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/zzb;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lcom/google/android/gms/drive/query/internal/zzb;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->a:Lcom/google/android/gms/drive/query/internal/zzb;

    .line 20
    .line 21
    instance-of v2, p1, Lcom/google/android/gms/drive/query/internal/zzd;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move-object v2, p1

    .line 26
    check-cast v2, Lcom/google/android/gms/drive/query/internal/zzd;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v2, v1

    .line 30
    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->b:Lcom/google/android/gms/drive/query/internal/zzd;

    .line 31
    .line 32
    instance-of v3, p1, Lcom/google/android/gms/drive/query/internal/zzr;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    check-cast v3, Lcom/google/android/gms/drive/query/internal/zzr;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object v3, v1

    .line 41
    :goto_2
    iput-object v3, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->c:Lcom/google/android/gms/drive/query/internal/zzr;

    .line 42
    .line 43
    instance-of v4, p1, Lcom/google/android/gms/drive/query/internal/zzv;

    .line 44
    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    move-object v4, p1

    .line 48
    check-cast v4, Lcom/google/android/gms/drive/query/internal/zzv;

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object v4, v1

    .line 52
    :goto_3
    iput-object v4, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->d:Lcom/google/android/gms/drive/query/internal/zzv;

    .line 53
    .line 54
    instance-of v5, p1, Lcom/google/android/gms/drive/query/internal/zzp;

    .line 55
    .line 56
    if-eqz v5, :cond_4

    .line 57
    .line 58
    move-object v5, p1

    .line 59
    check-cast v5, Lcom/google/android/gms/drive/query/internal/zzp;

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move-object v5, v1

    .line 63
    :goto_4
    iput-object v5, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->e:Lcom/google/android/gms/drive/query/internal/zzp;

    .line 64
    .line 65
    instance-of v6, p1, Lcom/google/android/gms/drive/query/internal/zzt;

    .line 66
    .line 67
    if-eqz v6, :cond_5

    .line 68
    .line 69
    move-object v6, p1

    .line 70
    check-cast v6, Lcom/google/android/gms/drive/query/internal/zzt;

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_5
    move-object v6, v1

    .line 74
    :goto_5
    iput-object v6, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->f:Lcom/google/android/gms/drive/query/internal/zzt;

    .line 75
    .line 76
    instance-of v7, p1, Lcom/google/android/gms/drive/query/internal/zzn;

    .line 77
    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    move-object v7, p1

    .line 81
    check-cast v7, Lcom/google/android/gms/drive/query/internal/zzn;

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    move-object v7, v1

    .line 85
    :goto_6
    iput-object v7, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->i:Lcom/google/android/gms/drive/query/internal/zzn;

    .line 86
    .line 87
    instance-of v8, p1, Lcom/google/android/gms/drive/query/internal/zzl;

    .line 88
    .line 89
    if-eqz v8, :cond_7

    .line 90
    .line 91
    move-object v8, p1

    .line 92
    check-cast v8, Lcom/google/android/gms/drive/query/internal/zzl;

    .line 93
    .line 94
    goto :goto_7

    .line 95
    :cond_7
    move-object v8, v1

    .line 96
    :goto_7
    iput-object v8, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->v:Lcom/google/android/gms/drive/query/internal/zzl;

    .line 97
    .line 98
    instance-of v9, p1, Lcom/google/android/gms/drive/query/internal/zzz;

    .line 99
    .line 100
    if-eqz v9, :cond_8

    .line 101
    .line 102
    move-object v9, p1

    .line 103
    check-cast v9, Lcom/google/android/gms/drive/query/internal/zzz;

    .line 104
    .line 105
    goto :goto_8

    .line 106
    :cond_8
    move-object v9, v1

    .line 107
    :goto_8
    iput-object v9, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->w:Lcom/google/android/gms/drive/query/internal/zzz;

    .line 108
    .line 109
    if-nez v0, :cond_a

    .line 110
    .line 111
    if-nez v2, :cond_a

    .line 112
    .line 113
    if-nez v3, :cond_a

    .line 114
    .line 115
    if-nez v4, :cond_a

    .line 116
    .line 117
    if-nez v5, :cond_a

    .line 118
    .line 119
    if-nez v6, :cond_a

    .line 120
    .line 121
    if-nez v7, :cond_a

    .line 122
    .line 123
    if-nez v8, :cond_a

    .line 124
    .line 125
    if-eqz v9, :cond_9

    .line 126
    .line 127
    goto :goto_9

    .line 128
    :cond_9
    const-string p0, "Invalid filter type."

    .line 129
    .line 130
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_a
    :goto_9
    iput-object p1, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    .line 135
    .line 136
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/query/internal/zzb;Lcom/google/android/gms/drive/query/internal/zzd;Lcom/google/android/gms/drive/query/internal/zzr;Lcom/google/android/gms/drive/query/internal/zzv;Lcom/google/android/gms/drive/query/internal/zzp;Lcom/google/android/gms/drive/query/internal/zzt;Lcom/google/android/gms/drive/query/internal/zzn;Lcom/google/android/gms/drive/query/internal/zzl;Lcom/google/android/gms/drive/query/internal/zzz;)V
    .locals 0

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    iput-object p1, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->a:Lcom/google/android/gms/drive/query/internal/zzb;

    .line 139
    iput-object p2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->b:Lcom/google/android/gms/drive/query/internal/zzd;

    .line 140
    iput-object p3, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->c:Lcom/google/android/gms/drive/query/internal/zzr;

    .line 141
    iput-object p4, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->d:Lcom/google/android/gms/drive/query/internal/zzv;

    .line 142
    iput-object p5, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->e:Lcom/google/android/gms/drive/query/internal/zzp;

    .line 143
    iput-object p6, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->f:Lcom/google/android/gms/drive/query/internal/zzt;

    .line 144
    iput-object p7, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->i:Lcom/google/android/gms/drive/query/internal/zzn;

    .line 145
    iput-object p8, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->v:Lcom/google/android/gms/drive/query/internal/zzl;

    .line 146
    iput-object p9, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->w:Lcom/google/android/gms/drive/query/internal/zzz;

    if-eqz p1, :cond_0

    .line 147
    iput-object p1, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 148
    iput-object p2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    :cond_1
    if-eqz p3, :cond_2

    .line 149
    iput-object p3, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    :cond_2
    if-eqz p4, :cond_3

    .line 150
    iput-object p4, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    :cond_3
    if-eqz p5, :cond_4

    .line 151
    iput-object p5, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    :cond_4
    if-eqz p6, :cond_5

    .line 152
    iput-object p6, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    :cond_5
    if-eqz p7, :cond_6

    .line 153
    iput-object p7, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    :cond_6
    if-eqz p8, :cond_7

    .line 154
    iput-object p8, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    :cond_7
    if-eqz p9, :cond_8

    .line 155
    iput-object p9, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->U:Lcom/google/android/gms/drive/query/Filter;

    return-void

    .line 156
    :cond_8
    const-string p0, "At least one filter must be set."

    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->a:Lcom/google/android/gms/drive/query/internal/zzb;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->b:Lcom/google/android/gms/drive/query/internal/zzd;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->c:Lcom/google/android/gms/drive/query/internal/zzr;

    .line 22
    .line 23
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->d:Lcom/google/android/gms/drive/query/internal/zzv;

    .line 28
    .line 29
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x5

    .line 33
    iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->e:Lcom/google/android/gms/drive/query/internal/zzp;

    .line 34
    .line 35
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x6

    .line 39
    iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->f:Lcom/google/android/gms/drive/query/internal/zzt;

    .line 40
    .line 41
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x7

    .line 45
    iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->i:Lcom/google/android/gms/drive/query/internal/zzn;

    .line 46
    .line 47
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 48
    .line 49
    .line 50
    const/16 v1, 0x8

    .line 51
    .line 52
    iget-object v2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->v:Lcom/google/android/gms/drive/query/internal/zzl;

    .line 53
    .line 54
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x9

    .line 58
    .line 59
    iget-object p0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->w:Lcom/google/android/gms/drive/query/internal/zzz;

    .line 60
    .line 61
    invoke-static {p1, v1, p0, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
