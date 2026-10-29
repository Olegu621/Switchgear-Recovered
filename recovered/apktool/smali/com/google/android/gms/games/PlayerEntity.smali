.class public final Lcom/google/android/gms/games/PlayerEntity;
.super Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/games/Player;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/PlayerEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final U:Ljava/lang/String;

.field public final V:Ljava/lang/String;

.field public final W:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

.field public final X:Lcom/google/android/gms/games/PlayerLevelInfo;

.field public final Y:Z

.field public final Z:Z

.field public final a0:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final b0:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final c0:Landroid/net/Uri;

.field public final d:Landroid/net/Uri;

.field public final d0:Ljava/lang/String;

.field public final e:Landroid/net/Uri;

.field public final e0:Landroid/net/Uri;

.field public final f:J

.field public final f0:Ljava/lang/String;

.field public final g0:J

.field public final h0:Lcom/google/android/gms/games/zzt;

.field public final i:I

.field public final i0:Lcom/google/android/gms/games/zza;

.field public final j0:Z

.field public final v:J

.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcl3;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcl3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/games/PlayerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/Player;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->t1()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->f()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lcom/google/android/gms/games/PlayerEntity;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->c()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->d:Landroid/net/Uri;

    .line 21
    .line 22
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getIconImageUrl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->w:Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->h()Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iput-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->e:Landroid/net/Uri;

    .line 33
    .line 34
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getHiResImageUrl()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->U:Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->C()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    iput-wide v2, p0, Lcom/google/android/gms/games/PlayerEntity;->f:J

    .line 45
    .line 46
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zza()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iput v4, p0, Lcom/google/android/gms/games/PlayerEntity;->i:I

    .line 51
    .line 52
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->X()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    iput-wide v4, p0, Lcom/google/android/gms/games/PlayerEntity;->v:J

    .line 57
    .line 58
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->V:Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzh()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    iput-boolean v4, p0, Lcom/google/android/gms/games/PlayerEntity;->Y:Z

    .line 69
    .line 70
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzc()Lcom/google/android/gms/games/internal/player/zza;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const/4 v5, 0x0

    .line 75
    if-nez v4, :cond_0

    .line 76
    .line 77
    move-object v6, v5

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    new-instance v6, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    .line 80
    .line 81
    invoke-direct {v6, v4}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;-><init>(Lcom/google/android/gms/games/internal/player/zza;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    iput-object v6, p0, Lcom/google/android/gms/games/PlayerEntity;->W:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    .line 85
    .line 86
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->f0()Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->X:Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 91
    .line 92
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzf()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    iput-boolean v4, p0, Lcom/google/android/gms/games/PlayerEntity;->Z:Z

    .line 97
    .line 98
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzd()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->a0:Ljava/lang/String;

    .line 103
    .line 104
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zze()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->b0:Ljava/lang/String;

    .line 109
    .line 110
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->l()Landroid/net/Uri;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->c0:Landroid/net/Uri;

    .line 115
    .line 116
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getBannerImageLandscapeUrl()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->d0:Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->F()Landroid/net/Uri;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->e0:Landroid/net/Uri;

    .line 127
    .line 128
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getBannerImagePortraitUrl()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->f0:Ljava/lang/String;

    .line 133
    .line 134
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzb()J

    .line 135
    .line 136
    .line 137
    move-result-wide v6

    .line 138
    iput-wide v6, p0, Lcom/google/android/gms/games/PlayerEntity;->g0:J

    .line 139
    .line 140
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->L0()Lcom/google/android/gms/games/PlayerRelationshipInfo;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    if-nez v4, :cond_1

    .line 145
    .line 146
    move-object v6, v5

    .line 147
    goto :goto_1

    .line 148
    :cond_1
    new-instance v6, Lcom/google/android/gms/games/zzt;

    .line 149
    .line 150
    invoke-interface {v4}, Lun0;->freeze()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-direct {v6, v4}, Lcom/google/android/gms/games/zzt;-><init>(Lcom/google/android/gms/games/PlayerRelationshipInfo;)V

    .line 155
    .line 156
    .line 157
    :goto_1
    iput-object v6, p0, Lcom/google/android/gms/games/PlayerEntity;->h0:Lcom/google/android/gms/games/zzt;

    .line 158
    .line 159
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->P()Lcom/google/android/gms/games/CurrentPlayerInfo;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-nez v4, :cond_2

    .line 164
    .line 165
    move-object v4, v5

    .line 166
    goto :goto_2

    .line 167
    :cond_2
    invoke-interface {v4}, Lun0;->freeze()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    :goto_2
    check-cast v4, Lcom/google/android/gms/games/zza;

    .line 172
    .line 173
    iput-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->i0:Lcom/google/android/gms/games/zza;

    .line 174
    .line 175
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzg()Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    iput-boolean p1, p0, Lcom/google/android/gms/games/PlayerEntity;->j0:Z

    .line 180
    .line 181
    const-string p0, "null reference"

    .line 182
    .line 183
    if-eqz v0, :cond_5

    .line 184
    .line 185
    if-eqz v1, :cond_4

    .line 186
    .line 187
    const-wide/16 p0, 0x0

    .line 188
    .line 189
    cmp-long p0, v2, p0

    .line 190
    .line 191
    if-lez p0, :cond_3

    .line 192
    .line 193
    const/4 p0, 0x1

    .line 194
    goto :goto_3

    .line 195
    :cond_3
    const/4 p0, 0x0

    .line 196
    :goto_3
    invoke-static {p0}, Lkb1;->q(Z)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_4
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v5

    .line 204
    :cond_5
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v5
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;Lcom/google/android/gms/games/PlayerLevelInfo;ZZLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLcom/google/android/gms/games/zzt;Lcom/google/android/gms/games/zza;Z)V
    .locals 0

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/games/PlayerEntity;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/games/PlayerEntity;->d:Landroid/net/Uri;

    iput-object p10, p0, Lcom/google/android/gms/games/PlayerEntity;->w:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/PlayerEntity;->e:Landroid/net/Uri;

    iput-object p11, p0, Lcom/google/android/gms/games/PlayerEntity;->U:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/games/PlayerEntity;->f:J

    iput p7, p0, Lcom/google/android/gms/games/PlayerEntity;->i:I

    iput-wide p8, p0, Lcom/google/android/gms/games/PlayerEntity;->v:J

    iput-object p12, p0, Lcom/google/android/gms/games/PlayerEntity;->V:Ljava/lang/String;

    iput-boolean p15, p0, Lcom/google/android/gms/games/PlayerEntity;->Y:Z

    iput-object p13, p0, Lcom/google/android/gms/games/PlayerEntity;->W:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    iput-object p14, p0, Lcom/google/android/gms/games/PlayerEntity;->X:Lcom/google/android/gms/games/PlayerLevelInfo;

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/google/android/gms/games/PlayerEntity;->Z:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->a0:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->b0:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->c0:Landroid/net/Uri;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->d0:Ljava/lang/String;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->e0:Landroid/net/Uri;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->f0:Ljava/lang/String;

    move-wide/from16 p1, p23

    iput-wide p1, p0, Lcom/google/android/gms/games/PlayerEntity;->g0:J

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->h0:Lcom/google/android/gms/games/zzt;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/google/android/gms/games/PlayerEntity;->i0:Lcom/google/android/gms/games/zza;

    move/from16 p1, p27

    iput-boolean p1, p0, Lcom/google/android/gms/games/PlayerEntity;->j0:Z

    return-void
.end method

.method public static F1(Lcom/google/android/gms/games/Player;)I
    .locals 17

    .line 1
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->t1()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->f()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->zzf()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->c()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->h()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->C()J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->f0()Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->zzd()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->zze()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->l()Landroid/net/Uri;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->F()Landroid/net/Uri;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->zzb()J

    .line 58
    .line 59
    .line 60
    move-result-wide v13

    .line 61
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->L0()Lcom/google/android/gms/games/PlayerRelationshipInfo;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->P()Lcom/google/android/gms/games/CurrentPlayerInfo;

    .line 70
    .line 71
    .line 72
    move-result-object v15

    .line 73
    invoke-interface/range {p0 .. p0}, Lcom/google/android/gms/games/Player;->zzg()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v16

    .line 81
    filled-new-array/range {v1 .. v16}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    return v0
.end method

.method public static G1(Lcom/google/android/gms/games/Player;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lwc0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lwc0;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "PlayerId"

    .line 7
    .line 8
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->t1()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "DisplayName"

    .line 16
    .line 17
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->f()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzf()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "HasDebugAccess"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "IconImageUri"

    .line 38
    .line 39
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->c()Landroid/net/Uri;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v1, "IconImageUrl"

    .line 47
    .line 48
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getIconImageUrl()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v1, "HiResImageUri"

    .line 56
    .line 57
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->h()Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v1, "HiResImageUrl"

    .line 65
    .line 66
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getHiResImageUrl()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->C()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v2, "RetrievedTimestamp"

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v1, "Title"

    .line 87
    .line 88
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v1, "LevelInfo"

    .line 96
    .line 97
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->f0()Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string v1, "GamerTag"

    .line 105
    .line 106
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzd()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v1, "Name"

    .line 114
    .line 115
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zze()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const-string v1, "BannerImageLandscapeUri"

    .line 123
    .line 124
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->l()Landroid/net/Uri;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v1, "BannerImageLandscapeUrl"

    .line 132
    .line 133
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getBannerImageLandscapeUrl()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const-string v1, "BannerImagePortraitUri"

    .line 141
    .line 142
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->F()Landroid/net/Uri;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const-string v1, "BannerImagePortraitUrl"

    .line 150
    .line 151
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getBannerImagePortraitUrl()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const-string v1, "CurrentPlayerInfo"

    .line 159
    .line 160
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->P()Lcom/google/android/gms/games/CurrentPlayerInfo;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzb()J

    .line 168
    .line 169
    .line 170
    move-result-wide v1

    .line 171
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    const-string v2, "TotalUnlockedAchievement"

    .line 176
    .line 177
    invoke-virtual {v0, v1, v2}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzg()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_0

    .line 185
    .line 186
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzg()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    const-string v2, "AlwaysAutoSignIn"

    .line 195
    .line 196
    invoke-virtual {v0, v1, v2}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_0
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->L0()Lcom/google/android/gms/games/PlayerRelationshipInfo;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-eqz v1, :cond_1

    .line 204
    .line 205
    const-string v1, "RelationshipInfo"

    .line 206
    .line 207
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->L0()Lcom/google/android/gms/games/PlayerRelationshipInfo;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-virtual {v0, p0, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :cond_1
    invoke-virtual {v0}, Lwc0;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0
.end method

.method public static H1(Lcom/google/android/gms/games/Player;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/games/Player;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    if-ne p0, p1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lcom/google/android/gms/games/Player;

    .line 12
    .line 13
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->t1()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->t1()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->f()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->f()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzf()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzf()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->c()Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->c()Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->h()Landroid/net/Uri;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->h()Landroid/net/Uri;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->C()J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->C()J

    .line 100
    .line 101
    .line 102
    move-result-wide v1

    .line 103
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->f0()Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->f0()Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_2

    .line 140
    .line 141
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzd()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzd()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_2

    .line 154
    .line 155
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zze()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zze()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_2

    .line 168
    .line 169
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->l()Landroid/net/Uri;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->l()Landroid/net/Uri;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_2

    .line 182
    .line 183
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->F()Landroid/net/Uri;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->F()Landroid/net/Uri;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_2

    .line 196
    .line 197
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzb()J

    .line 198
    .line 199
    .line 200
    move-result-wide v0

    .line 201
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzb()J

    .line 206
    .line 207
    .line 208
    move-result-wide v1

    .line 209
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_2

    .line 218
    .line 219
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->P()Lcom/google/android/gms/games/CurrentPlayerInfo;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->P()Lcom/google/android/gms/games/CurrentPlayerInfo;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_2

    .line 232
    .line 233
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->L0()Lcom/google/android/gms/games/PlayerRelationshipInfo;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->L0()Lcom/google/android/gms/games/PlayerRelationshipInfo;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_2

    .line 246
    .line 247
    invoke-interface {p1}, Lcom/google/android/gms/games/Player;->zzg()Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-interface {p0}, Lcom/google/android/gms/games/Player;->zzg()Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-static {p1, p0}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result p0

    .line 267
    if-eqz p0, :cond_2

    .line 268
    .line 269
    :goto_0
    const/4 p0, 0x1

    .line 270
    return p0

    .line 271
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 272
    return p0
.end method


# virtual methods
.method public final C()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final F()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->e0:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public final L0()Lcom/google/android/gms/games/PlayerRelationshipInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->h0:Lcom/google/android/gms/games/zzt;

    .line 2
    .line 3
    return-object p0
.end method

.method public final P()Lcom/google/android/gms/games/CurrentPlayerInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->i0:Lcom/google/android/gms/games/zza;

    .line 2
    .line 3
    return-object p0
.end method

.method public final X()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->v:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->d:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/gms/games/PlayerEntity;->H1(Lcom/google/android/gms/games/Player;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f0()Lcom/google/android/gms/games/PlayerLevelInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->X:Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic freeze()Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getBannerImageLandscapeUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->d0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBannerImagePortraitUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->f0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHiResImageUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->U:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIconImageUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->w:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->V:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->e:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->F1(Lcom/google/android/gms/games/Player;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final l()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->c0:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->G1(Lcom/google/android/gms/games/Player;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 7

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
    iget-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->b:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    iget-object v2, p0, Lcom/google/android/gms/games/PlayerEntity;->d:Landroid/net/Uri;

    .line 22
    .line 23
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/gms/games/PlayerEntity;->e:Landroid/net/Uri;

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    invoke-static {p1, v2, v1, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x5

    .line 33
    const/16 v4, 0x8

    .line 34
    .line 35
    invoke-static {p1, v1, v4}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 36
    .line 37
    .line 38
    iget-wide v5, p0, Lcom/google/android/gms/games/PlayerEntity;->f:J

    .line 39
    .line 40
    invoke-virtual {p1, v5, v6}, Landroid/os/Parcel;->writeLong(J)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 45
    .line 46
    .line 47
    iget v1, p0, Lcom/google/android/gms/games/PlayerEntity;->i:I

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    invoke-static {p1, v1, v4}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 54
    .line 55
    .line 56
    iget-wide v5, p0, Lcom/google/android/gms/games/PlayerEntity;->v:J

    .line 57
    .line 58
    invoke-virtual {p1, v5, v6}, Landroid/os/Parcel;->writeLong(J)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/google/android/gms/games/PlayerEntity;->w:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {p1, v4, v1, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    const/16 v1, 0x9

    .line 67
    .line 68
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->U:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {p1, v1, v5, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const/16 v1, 0xe

    .line 74
    .line 75
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->V:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p1, v1, v5, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    const/16 v1, 0xf

    .line 81
    .line 82
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->W:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    .line 83
    .line 84
    invoke-static {p1, v1, v5, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 85
    .line 86
    .line 87
    const/16 v1, 0x10

    .line 88
    .line 89
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->X:Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 90
    .line 91
    invoke-static {p1, v1, v5, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 92
    .line 93
    .line 94
    const/16 v1, 0x12

    .line 95
    .line 96
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 97
    .line 98
    .line 99
    iget-boolean v1, p0, Lcom/google/android/gms/games/PlayerEntity;->Y:Z

    .line 100
    .line 101
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 102
    .line 103
    .line 104
    const/16 v1, 0x13

    .line 105
    .line 106
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 107
    .line 108
    .line 109
    iget-boolean v1, p0, Lcom/google/android/gms/games/PlayerEntity;->Z:Z

    .line 110
    .line 111
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 112
    .line 113
    .line 114
    const/16 v1, 0x14

    .line 115
    .line 116
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->a0:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {p1, v1, v5, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 119
    .line 120
    .line 121
    const/16 v1, 0x15

    .line 122
    .line 123
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->b0:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {p1, v1, v5, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    const/16 v1, 0x16

    .line 129
    .line 130
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->c0:Landroid/net/Uri;

    .line 131
    .line 132
    invoke-static {p1, v1, v5, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 133
    .line 134
    .line 135
    const/16 v1, 0x17

    .line 136
    .line 137
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->d0:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {p1, v1, v5, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    const/16 v1, 0x18

    .line 143
    .line 144
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->e0:Landroid/net/Uri;

    .line 145
    .line 146
    invoke-static {p1, v1, v5, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 147
    .line 148
    .line 149
    const/16 v1, 0x19

    .line 150
    .line 151
    iget-object v5, p0, Lcom/google/android/gms/games/PlayerEntity;->f0:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {p1, v1, v5, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 154
    .line 155
    .line 156
    const/16 v1, 0x1d

    .line 157
    .line 158
    invoke-static {p1, v1, v4}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 159
    .line 160
    .line 161
    iget-wide v4, p0, Lcom/google/android/gms/games/PlayerEntity;->g0:J

    .line 162
    .line 163
    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 164
    .line 165
    .line 166
    const/16 v1, 0x21

    .line 167
    .line 168
    iget-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->h0:Lcom/google/android/gms/games/zzt;

    .line 169
    .line 170
    invoke-static {p1, v1, v4, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 171
    .line 172
    .line 173
    const/16 v1, 0x23

    .line 174
    .line 175
    iget-object v4, p0, Lcom/google/android/gms/games/PlayerEntity;->i0:Lcom/google/android/gms/games/zza;

    .line 176
    .line 177
    invoke-static {p1, v1, v4, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 178
    .line 179
    .line 180
    const/16 p2, 0x24

    .line 181
    .line 182
    invoke-static {p1, p2, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 183
    .line 184
    .line 185
    iget-boolean p0, p0, Lcom/google/android/gms/games/PlayerEntity;->j0:Z

    .line 186
    .line 187
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public final zza()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/games/PlayerEntity;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public final zzb()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->g0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final zzc()Lcom/google/android/gms/games/internal/player/zza;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->W:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->a0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zze()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/PlayerEntity;->b0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzf()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/games/PlayerEntity;->Z:Z

    .line 2
    .line 3
    return p0
.end method

.method public final zzg()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/games/PlayerEntity;->j0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final zzh()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/games/PlayerEntity;->Y:Z

    .line 2
    .line 3
    return p0
.end method
