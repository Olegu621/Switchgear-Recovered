.class public final Lhs0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Leq2;


# direct methods
.method public synthetic constructor <init>(Leq2;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhs0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhs0;->c:Leq2;

    .line 4
    .line 5
    iput-object p2, p0, Lhs0;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lhs0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lhs0;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lhs0;->c:Leq2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    const-string v2, "Error in reading the json value for key "

    .line 13
    .line 14
    const-string v3, "genricDataMngr"

    .line 15
    .line 16
    iget-object p0, p0, Leq2;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lts0;

    .line 19
    .line 20
    const-string v4, "user_data_key_mapping"

    .line 21
    .line 22
    const-string v5, "notification_content"

    .line 23
    .line 24
    const-string v6, "network_headers"

    .line 25
    .line 26
    const-string v7, "push_token_sync_route"

    .line 27
    .line 28
    const-string v8, "polling_route"

    .line 29
    .line 30
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ler0;

    .line 33
    .line 34
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    if-nez v9, :cond_5

    .line 39
    .line 40
    invoke-static {v1}, Lb40;->t(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-nez v9, :cond_0

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_0
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    .line 48
    .line 49
    invoke-direct {v9, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v9, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception v1

    .line 58
    :try_start_2
    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-static {v3, v10, v1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v1, v0

    .line 66
    :goto_0
    invoke-static {v1}, Lb40;->r(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    if-eqz v10, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0, v8, v1}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 73
    .line 74
    .line 75
    :cond_1
    :try_start_3
    invoke-virtual {v9, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 79
    goto :goto_1

    .line 80
    :catch_1
    move-exception v1

    .line 81
    :try_start_4
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v3, v2, v1}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-static {v0}, Lb40;->r(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0, v7, v0}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-static {v6, v9}, Lts0;->f(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p0, v6, v0}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-static {v5, v9}, Lts0;->f(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p0, v5, v0}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    invoke-static {v4, v9}, Lts0;->f(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p0, v4, v0}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :catch_2
    move-exception p0

    .line 138
    const-string v0, "Unable to parse the generic sdk data"

    .line 139
    .line 140
    invoke-static {v3, v0, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    :goto_2
    return-void

    .line 144
    :pswitch_0
    const-string v0, "local_storage_data"

    .line 145
    .line 146
    iget-object p0, p0, Leq2;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p0, Liy;

    .line 149
    .line 150
    iget-object p0, p0, Liy;->a:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, Ler0;

    .line 153
    .line 154
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_9

    .line 159
    .line 160
    invoke-static {v1}, Lb40;->t(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    :try_start_5
    iget-object v2, p0, Ler0;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Ler0;

    .line 170
    .line 171
    invoke-virtual {v2, v0}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v2}, Lb40;->r(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_8

    .line 180
    .line 181
    new-instance v3, Lorg/json/JSONObject;

    .line 182
    .line 183
    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    new-instance v1, Lorg/json/JSONObject;

    .line 187
    .line 188
    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_7

    .line 200
    .line 201
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    check-cast v4, Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_7
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {p0, v0, v1}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_8
    invoke-virtual {p0, v0, v1}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :catch_3
    move-exception p0

    .line 228
    const-string v0, "ConfigMangr"

    .line 229
    .line 230
    const-string v1, "error in storing local storage data"

    .line 231
    .line 232
    invoke-static {v0, v1, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    :cond_9
    :goto_4
    return-void

    .line 236
    :pswitch_1
    iget-object p0, p0, Leq2;->i:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 239
    .line 240
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    check-cast p0, Lls0;

    .line 245
    .line 246
    if-eqz p0, :cond_a

    .line 247
    .line 248
    iget-object p0, p0, Lls0;->w:Lcom/helpshift/activities/HSMainActivity;

    .line 249
    .line 250
    if-eqz p0, :cond_a

    .line 251
    .line 252
    invoke-virtual {p0, v1}, Lcom/helpshift/activities/HSMainActivity;->e(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    :cond_a
    return-void

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
