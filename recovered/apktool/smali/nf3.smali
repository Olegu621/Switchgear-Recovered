.class public final Lnf3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final A:Ljava/lang/String;

.field public final B:Ljava/lang/String;

.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/lang/String;

.field public final K:Ljava/lang/String;

.field public final L:Ljava/lang/String;

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "external_player_id"

    .line 12
    .line 13
    iput-object v0, p0, Lnf3;->a:Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, "profile_name"

    .line 16
    .line 17
    iput-object v0, p0, Lnf3;->b:Ljava/lang/String;

    .line 18
    .line 19
    const-string v0, "profile_icon_image_uri"

    .line 20
    .line 21
    iput-object v0, p0, Lnf3;->c:Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "profile_icon_image_url"

    .line 24
    .line 25
    iput-object v0, p0, Lnf3;->d:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "profile_hi_res_image_uri"

    .line 28
    .line 29
    iput-object v0, p0, Lnf3;->e:Ljava/lang/String;

    .line 30
    .line 31
    const-string v0, "profile_hi_res_image_url"

    .line 32
    .line 33
    iput-object v0, p0, Lnf3;->f:Ljava/lang/String;

    .line 34
    .line 35
    const-string v0, "last_updated"

    .line 36
    .line 37
    iput-object v0, p0, Lnf3;->g:Ljava/lang/String;

    .line 38
    .line 39
    const-string v0, "is_in_circles"

    .line 40
    .line 41
    iput-object v0, p0, Lnf3;->h:Ljava/lang/String;

    .line 42
    .line 43
    const-string v0, "played_with_timestamp"

    .line 44
    .line 45
    iput-object v0, p0, Lnf3;->i:Ljava/lang/String;

    .line 46
    .line 47
    const-string v0, "current_xp_total"

    .line 48
    .line 49
    iput-object v0, p0, Lnf3;->j:Ljava/lang/String;

    .line 50
    .line 51
    const-string v0, "current_level"

    .line 52
    .line 53
    iput-object v0, p0, Lnf3;->k:Ljava/lang/String;

    .line 54
    .line 55
    const-string v0, "current_level_min_xp"

    .line 56
    .line 57
    iput-object v0, p0, Lnf3;->l:Ljava/lang/String;

    .line 58
    .line 59
    const-string v0, "current_level_max_xp"

    .line 60
    .line 61
    iput-object v0, p0, Lnf3;->m:Ljava/lang/String;

    .line 62
    .line 63
    const-string v0, "next_level"

    .line 64
    .line 65
    iput-object v0, p0, Lnf3;->n:Ljava/lang/String;

    .line 66
    .line 67
    const-string v0, "next_level_max_xp"

    .line 68
    .line 69
    iput-object v0, p0, Lnf3;->o:Ljava/lang/String;

    .line 70
    .line 71
    const-string v0, "last_level_up_timestamp"

    .line 72
    .line 73
    iput-object v0, p0, Lnf3;->p:Ljava/lang/String;

    .line 74
    .line 75
    const-string v0, "player_title"

    .line 76
    .line 77
    iput-object v0, p0, Lnf3;->q:Ljava/lang/String;

    .line 78
    .line 79
    const-string v0, "is_profile_visible"

    .line 80
    .line 81
    iput-object v0, p0, Lnf3;->r:Ljava/lang/String;

    .line 82
    .line 83
    const-string v0, "most_recent_external_game_id"

    .line 84
    .line 85
    iput-object v0, p0, Lnf3;->s:Ljava/lang/String;

    .line 86
    .line 87
    const-string v0, "most_recent_game_name"

    .line 88
    .line 89
    iput-object v0, p0, Lnf3;->t:Ljava/lang/String;

    .line 90
    .line 91
    const-string v0, "most_recent_activity_timestamp"

    .line 92
    .line 93
    iput-object v0, p0, Lnf3;->u:Ljava/lang/String;

    .line 94
    .line 95
    const-string v0, "most_recent_game_icon_uri"

    .line 96
    .line 97
    iput-object v0, p0, Lnf3;->v:Ljava/lang/String;

    .line 98
    .line 99
    const-string v0, "most_recent_game_hi_res_uri"

    .line 100
    .line 101
    iput-object v0, p0, Lnf3;->w:Ljava/lang/String;

    .line 102
    .line 103
    const-string v0, "most_recent_game_featured_uri"

    .line 104
    .line 105
    iput-object v0, p0, Lnf3;->x:Ljava/lang/String;

    .line 106
    .line 107
    const-string v0, "has_debug_access"

    .line 108
    .line 109
    iput-object v0, p0, Lnf3;->y:Ljava/lang/String;

    .line 110
    .line 111
    const-string v0, "gamer_tag"

    .line 112
    .line 113
    iput-object v0, p0, Lnf3;->z:Ljava/lang/String;

    .line 114
    .line 115
    const-string v0, "real_name"

    .line 116
    .line 117
    iput-object v0, p0, Lnf3;->A:Ljava/lang/String;

    .line 118
    .line 119
    const-string v0, "banner_image_landscape_uri"

    .line 120
    .line 121
    iput-object v0, p0, Lnf3;->B:Ljava/lang/String;

    .line 122
    .line 123
    const-string v0, "banner_image_landscape_url"

    .line 124
    .line 125
    iput-object v0, p0, Lnf3;->C:Ljava/lang/String;

    .line 126
    .line 127
    const-string v0, "banner_image_portrait_uri"

    .line 128
    .line 129
    iput-object v0, p0, Lnf3;->D:Ljava/lang/String;

    .line 130
    .line 131
    const-string v0, "banner_image_portrait_url"

    .line 132
    .line 133
    iput-object v0, p0, Lnf3;->E:Ljava/lang/String;

    .line 134
    .line 135
    const-string v0, "total_unlocked_achievements"

    .line 136
    .line 137
    iput-object v0, p0, Lnf3;->F:Ljava/lang/String;

    .line 138
    .line 139
    const-string v0, "play_together_friend_status"

    .line 140
    .line 141
    iput-object v0, p0, Lnf3;->G:Ljava/lang/String;

    .line 142
    .line 143
    const-string v0, "play_together_nickname"

    .line 144
    .line 145
    iput-object v0, p0, Lnf3;->H:Ljava/lang/String;

    .line 146
    .line 147
    const-string v0, "play_together_invitation_nickname"

    .line 148
    .line 149
    iput-object v0, p0, Lnf3;->I:Ljava/lang/String;

    .line 150
    .line 151
    const-string v0, "nickname_abuse_report_token"

    .line 152
    .line 153
    iput-object v0, p0, Lnf3;->J:Ljava/lang/String;

    .line 154
    .line 155
    const-string v0, "friends_list_visibility"

    .line 156
    .line 157
    iput-object v0, p0, Lnf3;->K:Ljava/lang/String;

    .line 158
    .line 159
    const-string v0, "always_auto_sign_in"

    .line 160
    .line 161
    :goto_0
    iput-object v0, p0, Lnf3;->L:Ljava/lang/String;

    .line 162
    .line 163
    return-void

    .line 164
    :cond_0
    const-string v0, "nullexternal_player_id"

    .line 165
    .line 166
    iput-object v0, p0, Lnf3;->a:Ljava/lang/String;

    .line 167
    .line 168
    const-string v0, "nullprofile_name"

    .line 169
    .line 170
    iput-object v0, p0, Lnf3;->b:Ljava/lang/String;

    .line 171
    .line 172
    const-string v0, "nullprofile_icon_image_uri"

    .line 173
    .line 174
    iput-object v0, p0, Lnf3;->c:Ljava/lang/String;

    .line 175
    .line 176
    const-string v0, "nullprofile_icon_image_url"

    .line 177
    .line 178
    iput-object v0, p0, Lnf3;->d:Ljava/lang/String;

    .line 179
    .line 180
    const-string v0, "nullprofile_hi_res_image_uri"

    .line 181
    .line 182
    iput-object v0, p0, Lnf3;->e:Ljava/lang/String;

    .line 183
    .line 184
    const-string v0, "nullprofile_hi_res_image_url"

    .line 185
    .line 186
    iput-object v0, p0, Lnf3;->f:Ljava/lang/String;

    .line 187
    .line 188
    const-string v0, "nulllast_updated"

    .line 189
    .line 190
    iput-object v0, p0, Lnf3;->g:Ljava/lang/String;

    .line 191
    .line 192
    const-string v0, "nullis_in_circles"

    .line 193
    .line 194
    iput-object v0, p0, Lnf3;->h:Ljava/lang/String;

    .line 195
    .line 196
    const-string v0, "nullplayed_with_timestamp"

    .line 197
    .line 198
    iput-object v0, p0, Lnf3;->i:Ljava/lang/String;

    .line 199
    .line 200
    const-string v0, "nullcurrent_xp_total"

    .line 201
    .line 202
    iput-object v0, p0, Lnf3;->j:Ljava/lang/String;

    .line 203
    .line 204
    const-string v0, "nullcurrent_level"

    .line 205
    .line 206
    iput-object v0, p0, Lnf3;->k:Ljava/lang/String;

    .line 207
    .line 208
    const-string v0, "nullcurrent_level_min_xp"

    .line 209
    .line 210
    iput-object v0, p0, Lnf3;->l:Ljava/lang/String;

    .line 211
    .line 212
    const-string v0, "nullcurrent_level_max_xp"

    .line 213
    .line 214
    iput-object v0, p0, Lnf3;->m:Ljava/lang/String;

    .line 215
    .line 216
    const-string v0, "nullnext_level"

    .line 217
    .line 218
    iput-object v0, p0, Lnf3;->n:Ljava/lang/String;

    .line 219
    .line 220
    const-string v0, "nullnext_level_max_xp"

    .line 221
    .line 222
    iput-object v0, p0, Lnf3;->o:Ljava/lang/String;

    .line 223
    .line 224
    const-string v0, "nulllast_level_up_timestamp"

    .line 225
    .line 226
    iput-object v0, p0, Lnf3;->p:Ljava/lang/String;

    .line 227
    .line 228
    const-string v0, "nullplayer_title"

    .line 229
    .line 230
    iput-object v0, p0, Lnf3;->q:Ljava/lang/String;

    .line 231
    .line 232
    const-string v0, "nullis_profile_visible"

    .line 233
    .line 234
    iput-object v0, p0, Lnf3;->r:Ljava/lang/String;

    .line 235
    .line 236
    const-string v0, "nullmost_recent_external_game_id"

    .line 237
    .line 238
    iput-object v0, p0, Lnf3;->s:Ljava/lang/String;

    .line 239
    .line 240
    const-string v0, "nullmost_recent_game_name"

    .line 241
    .line 242
    iput-object v0, p0, Lnf3;->t:Ljava/lang/String;

    .line 243
    .line 244
    const-string v0, "nullmost_recent_activity_timestamp"

    .line 245
    .line 246
    iput-object v0, p0, Lnf3;->u:Ljava/lang/String;

    .line 247
    .line 248
    const-string v0, "nullmost_recent_game_icon_uri"

    .line 249
    .line 250
    iput-object v0, p0, Lnf3;->v:Ljava/lang/String;

    .line 251
    .line 252
    const-string v0, "nullmost_recent_game_hi_res_uri"

    .line 253
    .line 254
    iput-object v0, p0, Lnf3;->w:Ljava/lang/String;

    .line 255
    .line 256
    const-string v0, "nullmost_recent_game_featured_uri"

    .line 257
    .line 258
    iput-object v0, p0, Lnf3;->x:Ljava/lang/String;

    .line 259
    .line 260
    const-string v0, "nullhas_debug_access"

    .line 261
    .line 262
    iput-object v0, p0, Lnf3;->y:Ljava/lang/String;

    .line 263
    .line 264
    const-string v0, "nullgamer_tag"

    .line 265
    .line 266
    iput-object v0, p0, Lnf3;->z:Ljava/lang/String;

    .line 267
    .line 268
    const-string v0, "nullreal_name"

    .line 269
    .line 270
    iput-object v0, p0, Lnf3;->A:Ljava/lang/String;

    .line 271
    .line 272
    const-string v0, "nullbanner_image_landscape_uri"

    .line 273
    .line 274
    iput-object v0, p0, Lnf3;->B:Ljava/lang/String;

    .line 275
    .line 276
    const-string v0, "nullbanner_image_landscape_url"

    .line 277
    .line 278
    iput-object v0, p0, Lnf3;->C:Ljava/lang/String;

    .line 279
    .line 280
    const-string v0, "nullbanner_image_portrait_uri"

    .line 281
    .line 282
    iput-object v0, p0, Lnf3;->D:Ljava/lang/String;

    .line 283
    .line 284
    const-string v0, "nullbanner_image_portrait_url"

    .line 285
    .line 286
    iput-object v0, p0, Lnf3;->E:Ljava/lang/String;

    .line 287
    .line 288
    const-string v0, "nulltotal_unlocked_achievements"

    .line 289
    .line 290
    iput-object v0, p0, Lnf3;->F:Ljava/lang/String;

    .line 291
    .line 292
    const-string v0, "nullplay_together_friend_status"

    .line 293
    .line 294
    iput-object v0, p0, Lnf3;->G:Ljava/lang/String;

    .line 295
    .line 296
    const-string v0, "nullplay_together_nickname"

    .line 297
    .line 298
    iput-object v0, p0, Lnf3;->H:Ljava/lang/String;

    .line 299
    .line 300
    const-string v0, "nullplay_together_invitation_nickname"

    .line 301
    .line 302
    iput-object v0, p0, Lnf3;->I:Ljava/lang/String;

    .line 303
    .line 304
    const-string v0, "nullnickname_abuse_report_token"

    .line 305
    .line 306
    iput-object v0, p0, Lnf3;->J:Ljava/lang/String;

    .line 307
    .line 308
    const-string v0, "nullfriends_list_visibility"

    .line 309
    .line 310
    iput-object v0, p0, Lnf3;->K:Ljava/lang/String;

    .line 311
    .line 312
    const-string v0, "nullalways_auto_sign_in"

    .line 313
    .line 314
    goto/16 :goto_0
.end method
