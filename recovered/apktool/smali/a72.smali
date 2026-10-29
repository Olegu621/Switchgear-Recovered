.class public final La72;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ls33;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Lr33;

.field public final c:Landroid/os/Bundle;

.field public final d:Lv61;

.field public final e:Lx62;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lz62;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Lz62;->getSavedStateRegistry()Lx62;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, La72;->e:Lx62;

    .line 9
    .line 10
    invoke-interface {p2}, Lg71;->getLifecycle()Lv61;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, La72;->d:Lv61;

    .line 15
    .line 16
    iput-object p3, p0, La72;->c:Landroid/os/Bundle;

    .line 17
    .line 18
    iput-object p1, p0, La72;->a:Landroid/app/Application;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    sget-object p2, Lr33;->d:Lr33;

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    new-instance p2, Lr33;

    .line 27
    .line 28
    invoke-direct {p2, p1}, Lr33;-><init>(Landroid/app/Application;)V

    .line 29
    .line 30
    .line 31
    sput-object p2, Lr33;->d:Lr33;

    .line 32
    .line 33
    :cond_0
    sget-object p1, Lr33;->d:Lr33;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p1, Lr33;

    .line 40
    .line 41
    const/4 p2, 0x0

    .line 42
    invoke-direct {p1, p2}, Lr33;-><init>(Landroid/app/Application;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iput-object p1, p0, La72;->b:Lr33;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lq33;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, La72;->c(Ljava/lang/Class;Ljava/lang/String;)Lq33;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 13
    .line 14
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final b(Ljava/lang/Class;Lqk1;)Lq33;
    .locals 4

    .line 1
    sget-object v0, Lxt0;->W:Lxt0;

    .line 2
    .line 3
    iget-object v1, p2, Lm20;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    sget-object v3, Lmn0;->e:Lp62;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    sget-object v3, Lmn0;->f:Lq62;

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    sget-object v0, Ldc0;->X:Ldc0;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/app/Application;

    .line 37
    .line 38
    const-class v1, Lq8;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    sget-object v2, Lb72;->a:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v2, p1}, Lb72;->a(Ljava/util/List;Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object v2, Lb72;->b:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v2, p1}, Lb72;->a(Ljava/util/List;Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_0
    if-nez v2, :cond_1

    .line 62
    .line 63
    iget-object p0, p0, La72;->b:Lr33;

    .line 64
    .line 65
    invoke-virtual {p0, p1, p2}, Lr33;->b(Ljava/lang/Class;Lqk1;)Lq33;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_1
    if-eqz v1, :cond_2

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-static {p2}, Lmn0;->h(Lqk1;)Ln62;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p1, v2, p0}, Lb72;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lq33;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_2
    invoke-static {p2}, Lmn0;->h(Lqk1;)Ln62;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p1, v2, p0}, Lb72;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lq33;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_3
    iget-object p2, p0, La72;->d:Lv61;

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, La72;->c(Ljava/lang/Class;Ljava/lang/String;)Lq33;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_4
    const-string p0, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    .line 110
    .line 111
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v2

    .line 115
    :cond_5
    const-string p0, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 116
    .line 117
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object v2
.end method

.method public final c(Ljava/lang/Class;Ljava/lang/String;)Lq33;
    .locals 7

    .line 1
    iget-object v0, p0, La72;->d:Lv61;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const-class v1, Lq8;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, La72;->a:Landroid/app/Application;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Lb72;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v2, p1}, Lb72;->a(Ljava/util/List;Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v2, Lb72;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v2, p1}, Lb72;->a(Ljava/util/List;Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    if-nez v2, :cond_3

    .line 31
    .line 32
    iget-object p2, p0, La72;->a:Landroid/app/Application;

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, La72;->b:Lr33;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lr33;->a(Ljava/lang/Class;)Lq33;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    sget-object p0, Lwm0;->b:Lwm0;

    .line 44
    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    new-instance p0, Lwm0;

    .line 48
    .line 49
    const/4 p2, 0x2

    .line 50
    invoke-direct {p0, p2}, Lwm0;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object p0, Lwm0;->b:Lwm0;

    .line 54
    .line 55
    :cond_2
    sget-object p0, Lwm0;->b:Lwm0;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lwm0;->a(Ljava/lang/Class;)Lq33;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_3
    iget-object v3, p0, La72;->e:Lx62;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v4, p0, La72;->c:Landroid/os/Bundle;

    .line 71
    .line 72
    invoke-virtual {v3, p2}, Lx62;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    sget-object v6, Ln62;->f:[Ljava/lang/Class;

    .line 77
    .line 78
    invoke-static {v5, v4}, Lj13;->d(Landroid/os/Bundle;Landroid/os/Bundle;)Ln62;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    new-instance v5, Lo62;

    .line 83
    .line 84
    invoke-direct {v5, p2, v4}, Lo62;-><init>(Ljava/lang/String;Ln62;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v0, v3}, Lo62;->a(Lv61;Lx62;)V

    .line 88
    .line 89
    .line 90
    move-object p2, v0

    .line 91
    check-cast p2, Li71;

    .line 92
    .line 93
    iget-object p2, p2, Li71;->c:Lu61;

    .line 94
    .line 95
    sget-object v6, Lu61;->b:Lu61;

    .line 96
    .line 97
    if-eq p2, v6, :cond_5

    .line 98
    .line 99
    sget-object v6, Lu61;->d:Lu61;

    .line 100
    .line 101
    invoke-virtual {p2, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-ltz p2, :cond_4

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    new-instance p2, Ll60;

    .line 109
    .line 110
    invoke-direct {p2, v0, v3}, Ll60;-><init>(Lv61;Lx62;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Lv61;->a(Lf71;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    :goto_1
    invoke-virtual {v3}, Lx62;->d()V

    .line 118
    .line 119
    .line 120
    :goto_2
    if-eqz v1, :cond_6

    .line 121
    .line 122
    iget-object p0, p0, La72;->a:Landroid/app/Application;

    .line 123
    .line 124
    if-eqz p0, :cond_6

    .line 125
    .line 126
    filled-new-array {p0, v4}, [Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p1, v2, p0}, Lb72;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lq33;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    goto :goto_3

    .line 135
    :cond_6
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p1, v2, p0}, Lb72;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lq33;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    :goto_3
    const-string p1, "androidx.lifecycle.savedstate.vm.tag"

    .line 144
    .line 145
    iget-object p2, p0, Lq33;->a:Ljava/util/HashMap;

    .line 146
    .line 147
    monitor-enter p2

    .line 148
    :try_start_0
    iget-object v0, p0, Lq33;->a:Ljava/util/HashMap;

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-nez v0, :cond_7

    .line 155
    .line 156
    iget-object v1, p0, Lq33;->a:Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-virtual {v1, p1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :catchall_0
    move-exception p0

    .line 163
    goto :goto_6

    .line 164
    :cond_7
    :goto_4
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    if-nez v0, :cond_8

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    move-object v5, v0

    .line 169
    :goto_5
    iget-boolean p1, p0, Lq33;->c:Z

    .line 170
    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    invoke-static {v5}, Lq33;->a(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_9
    return-object p0

    .line 177
    :goto_6
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    throw p0

    .line 179
    :cond_a
    const-string p0, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 180
    .line 181
    invoke-static {p0}, Ln4;->q(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    const/4 p0, 0x0

    .line 185
    return-object p0
.end method
