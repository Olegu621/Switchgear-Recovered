.class public final Lcom/google/android/gms/games/achievement/AchievementEntity;
.super Lcom/google/android/gms/games/internal/zzh;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/games/achievement/Achievement;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/games/achievement/AchievementEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final U:Ljava/lang/String;

.field public final V:Lcom/google/android/gms/games/PlayerEntity;

.field public final W:I

.field public final X:I

.field public final Y:Ljava/lang/String;

.field public final Z:J

.field public final a:Ljava/lang/String;

.field public final a0:J

.field public final b:I

.field public final b0:F

.field public final c:Ljava/lang/String;

.field public final c0:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Landroid/net/Uri;

.field public final f:Ljava/lang/String;

.field public final i:Landroid/net/Uri;

.field public final v:Ljava/lang/String;

.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltc3;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Ltc3;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/games/achievement/AchievementEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/achievement/AchievementRef;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "external_achievement_id"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->a:Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "type"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lz30;->d(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iput v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b:I

    .line 19
    .line 20
    const-string v2, "name"

    .line 21
    .line 22
    invoke-virtual {p1, v2}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->c:Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "description"

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->d:Ljava/lang/String;

    .line 35
    .line 36
    const-string v3, "unlocked_icon_image_uri"

    .line 37
    .line 38
    invoke-virtual {p1, v3}, Lz30;->w(Ljava/lang/String;)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->e:Landroid/net/Uri;

    .line 43
    .line 44
    const-string v3, "unlocked_icon_image_url"

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:Ljava/lang/String;

    .line 51
    .line 52
    const-string v3, "revealed_icon_image_uri"

    .line 53
    .line 54
    invoke-virtual {p1, v3}, Lz30;->w(Ljava/lang/String;)Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Landroid/net/Uri;

    .line 59
    .line 60
    const-string v3, "revealed_icon_image_url"

    .line 61
    .line 62
    invoke-virtual {p1, v3}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->zzb()Lcom/google/android/gms/games/Player;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const/4 v4, 0x0

    .line 73
    if-eqz v3, :cond_0

    .line 74
    .line 75
    new-instance v5, Lcom/google/android/gms/games/PlayerEntity;

    .line 76
    .line 77
    invoke-direct {v5, v3}, Lcom/google/android/gms/games/PlayerEntity;-><init>(Lcom/google/android/gms/games/Player;)V

    .line 78
    .line 79
    .line 80
    iput-object v5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->V:Lcom/google/android/gms/games/PlayerEntity;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    iput-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->V:Lcom/google/android/gms/games/PlayerEntity;

    .line 84
    .line 85
    :goto_0
    const-string v3, "state"

    .line 86
    .line 87
    invoke-virtual {p1, v3}, Lz30;->d(Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    iput v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->W:I

    .line 92
    .line 93
    const-string v3, "last_updated_timestamp"

    .line 94
    .line 95
    invoke-virtual {p1, v3}, Lz30;->e(Ljava/lang/String;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v5

    .line 99
    iput-wide v5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Z:J

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->W()J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    iput-wide v5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->a0:J

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->zza()F

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iput v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b0:F

    .line 112
    .line 113
    const-string v3, "external_game_id"

    .line 114
    .line 115
    invoke-virtual {p1, v3}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->c0:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p1, v1}, Lz30;->d(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    const/4 v5, 0x1

    .line 126
    const/4 v6, 0x0

    .line 127
    if-ne v3, v5, :cond_3

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->f1()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    iput v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:I

    .line 134
    .line 135
    invoke-virtual {p1, v1}, Lz30;->d(Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-ne v3, v5, :cond_1

    .line 140
    .line 141
    move v3, v5

    .line 142
    goto :goto_1

    .line 143
    :cond_1
    move v3, v6

    .line 144
    :goto_1
    invoke-static {v3}, Lkb1;->q(Z)V

    .line 145
    .line 146
    .line 147
    const-string v3, "formatted_total_steps"

    .line 148
    .line 149
    invoke-virtual {p1, v3}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    iput-object v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->U:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->D0()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    iput v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->X:I

    .line 160
    .line 161
    invoke-virtual {p1, v1}, Lz30;->d(Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-ne v1, v5, :cond_2

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_2
    move v5, v6

    .line 169
    :goto_2
    invoke-static {v5}, Lkb1;->q(Z)V

    .line 170
    .line 171
    .line 172
    const-string v1, "formatted_current_steps"

    .line 173
    .line 174
    invoke-virtual {p1, v1}, Lz30;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Y:Ljava/lang/String;

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_3
    iput v6, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:I

    .line 182
    .line 183
    iput-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->U:Ljava/lang/String;

    .line 184
    .line 185
    iput v6, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->X:I

    .line 186
    .line 187
    iput-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Y:Ljava/lang/String;

    .line 188
    .line 189
    :goto_3
    const-string p0, "null reference"

    .line 190
    .line 191
    if-eqz v0, :cond_5

    .line 192
    .line 193
    if-eqz v2, :cond_4

    .line 194
    .line 195
    return-void

    .line 196
    :cond_4
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v4

    .line 200
    :cond_5
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v4
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/gms/games/PlayerEntity;IILjava/lang/String;JJFLjava/lang/String;)V
    .locals 0

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 205
    iput-object p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->a:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b:I

    iput-object p3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->e:Landroid/net/Uri;

    iput-object p6, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Landroid/net/Uri;

    iput-object p8, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:Ljava/lang/String;

    iput p9, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:I

    iput-object p10, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->U:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->V:Lcom/google/android/gms/games/PlayerEntity;

    iput p12, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->W:I

    iput p13, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->X:I

    iput-object p14, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Y:Ljava/lang/String;

    move-wide p1, p15

    iput-wide p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Z:J

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->a0:J

    move/from16 p1, p19

    iput p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b0:F

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->c0:Ljava/lang/String;

    return-void
.end method

.method public static D1(Lcom/google/android/gms/games/achievement/Achievement;)I
    .locals 13

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->D0()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->f1()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    move v1, v0

    .line 19
    :goto_0
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->n0()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzc()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->W()J

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->U0()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    filled-new-array/range {v2 .. v12}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    return p0
.end method

.method public static E1(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lwc0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lwc0;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "Id"

    .line 7
    .line 8
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->n0()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "Game Id"

    .line 16
    .line 17
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzc()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "Type"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "Name"

    .line 38
    .line 39
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v1, "Description"

    .line 47
    .line 48
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v1, "Player"

    .line 56
    .line 57
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v2, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v2, "State"

    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zza()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v2, "Rarity Percent"

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/4 v2, 0x1

    .line 95
    if-ne v1, v2, :cond_0

    .line 96
    .line 97
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->D0()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-string v2, "CurrentSteps"

    .line 106
    .line 107
    invoke-virtual {v0, v1, v2}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->f1()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const-string v1, "TotalSteps"

    .line 119
    .line 120
    invoke-virtual {v0, p0, v1}, Lwc0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_0
    invoke-virtual {v0}, Lwc0;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0
.end method

.method public static F1(Lcom/google/android/gms/games/achievement/Achievement;Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/games/achievement/Achievement;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    if-ne p0, p1, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/google/android/gms/games/achievement/Achievement;

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eq v1, v2, :cond_2

    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_2
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v1, v0, :cond_4

    .line 31
    .line 32
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->D0()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->D0()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eq v1, v2, :cond_3

    .line 41
    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->f1()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->f1()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-ne v1, v2, :cond_5

    .line 53
    .line 54
    :cond_4
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->W()J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->W()J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    cmp-long v1, v1, v3

    .line 63
    .line 64
    if-nez v1, :cond_5

    .line 65
    .line 66
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-ne v1, v2, :cond_5

    .line 75
    .line 76
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->U0()J

    .line 77
    .line 78
    .line 79
    move-result-wide v1

    .line 80
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->U0()J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    cmp-long v1, v1, v3

    .line 85
    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->n0()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->n0()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v1, v2}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zzc()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzc()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v1, v2}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v1, v2}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_5

    .line 129
    .line 130
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v1, v2}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zzb()Lcom/google/android/gms/games/Player;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-static {v1, v2}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_5

    .line 157
    .line 158
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->zza()F

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->zza()F

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    cmpl-float p0, p1, p0

    .line 167
    .line 168
    if-nez p0, :cond_5

    .line 169
    .line 170
    :goto_0
    return v0

    .line 171
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 172
    return p0
.end method


# virtual methods
.method public final D0()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-static {v1}, Lkb1;->q(Z)V

    .line 9
    .line 10
    .line 11
    iget p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->X:I

    .line 12
    .line 13
    return p0
.end method

.method public final U0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Z:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final W()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->a0:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/gms/games/achievement/AchievementEntity;->F1(Lcom/google/android/gms/games/achievement/Achievement;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final f1()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-static {v1}, Lkb1;->q(Z)V

    .line 9
    .line 10
    .line 11
    iget p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:I

    .line 12
    .line 13
    return p0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getState()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->W:I

    .line 2
    .line 3
    return p0
.end method

.method public final getType()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->D1(Lcom/google/android/gms/games/achievement/Achievement;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final n0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->E1(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;

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
    iget-object v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->a:Ljava/lang/String;

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
    const/4 v2, 0x4

    .line 16
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b:I

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    iget-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1, v1, v4, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p1, v2, v1, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    iget-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->e:Landroid/net/Uri;

    .line 37
    .line 38
    invoke-static {p1, v1, v4, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x6

    .line 42
    iget-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1, v1, v4, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x7

    .line 48
    iget-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Landroid/net/Uri;

    .line 49
    .line 50
    invoke-static {p1, v1, v4, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:Ljava/lang/String;

    .line 54
    .line 55
    const/16 v4, 0x8

    .line 56
    .line 57
    invoke-static {p1, v4, v1, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    const/16 v1, 0x9

    .line 61
    .line 62
    invoke-static {p1, v1, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 63
    .line 64
    .line 65
    iget v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->w:I

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0xa

    .line 71
    .line 72
    iget-object v5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->U:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p1, v1, v5, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    const/16 v1, 0xb

    .line 78
    .line 79
    iget-object v5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->V:Lcom/google/android/gms/games/PlayerEntity;

    .line 80
    .line 81
    invoke-static {p1, v1, v5, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 82
    .line 83
    .line 84
    const/16 p2, 0xc

    .line 85
    .line 86
    invoke-static {p1, p2, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 87
    .line 88
    .line 89
    iget p2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->W:I

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    .line 93
    .line 94
    const/16 p2, 0xd

    .line 95
    .line 96
    invoke-static {p1, p2, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 97
    .line 98
    .line 99
    iget p2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->X:I

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 102
    .line 103
    .line 104
    const/16 p2, 0xe

    .line 105
    .line 106
    iget-object v1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Y:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {p1, p2, v1, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    const/16 p2, 0xf

    .line 112
    .line 113
    invoke-static {p1, p2, v4}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 114
    .line 115
    .line 116
    iget-wide v5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Z:J

    .line 117
    .line 118
    invoke-virtual {p1, v5, v6}, Landroid/os/Parcel;->writeLong(J)V

    .line 119
    .line 120
    .line 121
    const/16 p2, 0x10

    .line 122
    .line 123
    invoke-static {p1, p2, v4}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 124
    .line 125
    .line 126
    iget-wide v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->a0:J

    .line 127
    .line 128
    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 129
    .line 130
    .line 131
    const/16 p2, 0x11

    .line 132
    .line 133
    invoke-static {p1, p2, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 134
    .line 135
    .line 136
    iget p2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b0:F

    .line 137
    .line 138
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 139
    .line 140
    .line 141
    const/16 p2, 0x12

    .line 142
    .line 143
    iget-object p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->c0:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {p1, p2, p0, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 146
    .line 147
    .line 148
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final zza()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->b0:F

    .line 2
    .line 3
    return p0
.end method

.method public final zzb()Lcom/google/android/gms/games/Player;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->V:Lcom/google/android/gms/games/PlayerEntity;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->c0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
