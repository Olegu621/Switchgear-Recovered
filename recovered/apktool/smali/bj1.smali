.class public final Lbj1;
.super Lui1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lwe2;II)V
    .locals 0

    .line 1
    iput p3, p0, Lbj1;->c:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lui1;-><init>(Lwe2;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget v0, p0, Lbj1;->c:I

    .line 2
    .line 3
    iget-object p0, p0, Lui1;->a:Lwe2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lod2;

    .line 11
    .line 12
    const-string v0, "IABTCF_EnableAdvertiserConsentMode"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lod2;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lod2;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 40
    .line 41
    const-string v2, "settings"

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    sget-object v4, Lb21;->a:Lr11;

    .line 58
    .line 59
    iget-object v5, v4, Lb11;->b:Lb5;

    .line 60
    .line 61
    const-class v6, Lkotlinx/serialization/json/c;

    .line 62
    .line 63
    invoke-static {v6}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v5, v6}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v4, v1, v5}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Lkotlinx/serialization/json/c;

    .line 76
    .line 77
    const-string v5, "id"

    .line 78
    .line 79
    invoke-virtual {v4, v5}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Lkotlinx/serialization/json/b;

    .line 84
    .line 85
    if-eqz v4, :cond_1

    .line 86
    .line 87
    invoke-static {v4}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move-object v4, v3

    .line 97
    :goto_0
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-static {v4}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_2

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    sget-object v5, Lfh2;->a:[Lfh2;

    .line 107
    .line 108
    const-string v5, "settings-"

    .line 109
    .line 110
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v0, v5, v1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lod2;->a(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    :goto_1
    move-object v4, v3

    .line 122
    :goto_2
    if-eqz v4, :cond_5

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v1, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 128
    .line 129
    const-string v2, "tcf"

    .line 130
    .line 131
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-static {v1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_4

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_4
    sget-object v3, Lb21;->a:Lr11;

    .line 145
    .line 146
    iget-object v5, v3, Lb11;->b:Lb5;

    .line 147
    .line 148
    const-class v6, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 149
    .line 150
    invoke-static {v6}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-static {v5, v7}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v3, v1, v5}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 163
    .line 164
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, Lod2;

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object p0, p0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 172
    .line 173
    const-string v5, "IABTCF_AddtlConsent"

    .line 174
    .line 175
    const-string v7, ""

    .line 176
    .line 177
    invoke-interface {p0, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    iget-object v5, v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->a:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v1, v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->b:Ljava/util/Map;

    .line 184
    .line 185
    sget-object v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF$Companion;

    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 194
    .line 195
    invoke-direct {v7, v5, p0, v1}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 196
    .line 197
    .line 198
    iget-object p0, v3, Lb11;->b:Lb5;

    .line 199
    .line 200
    invoke-static {v6}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {p0, v1}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {v3, p0, v7}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    sget-object v1, Lfh2;->a:[Lfh2;

    .line 213
    .line 214
    const-string v1, "tcf-"

    .line 215
    .line 216
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v0, v1, p0}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const-string p0, "actual_tcf"

    .line 224
    .line 225
    invoke-virtual {v0, p0, v4}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v2}, Lod2;->a(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_5
    :goto_3
    return-void

    .line 232
    :pswitch_1
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast p0, Lod2;

    .line 235
    .line 236
    const-string v0, "locationTimeStamp"

    .line 237
    .line 238
    invoke-virtual {p0, v0}, Lod2;->a(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_2
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p0, Lod2;

    .line 245
    .line 246
    const-string v0, "cache"

    .line 247
    .line 248
    invoke-virtual {p0, v0}, Lod2;->a(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    :pswitch_3
    return-void

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
