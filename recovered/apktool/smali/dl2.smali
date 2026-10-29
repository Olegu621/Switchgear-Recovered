.class public final Ldl2;
.super Lsq3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final U:Ljava/util/List;

.field public final V:Z

.field public final W:Z

.field public final b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

.field public final c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

.field public final d:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

.field public final e:Lur3;

.field public final f:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final v:Lac1;

.field public final w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Lur3;Ljava/util/List;Ljava/util/List;Lac1;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lsq3;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldl2;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 23
    .line 24
    iput-object p2, p0, Ldl2;->c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 25
    .line 26
    iput-object p3, p0, Ldl2;->d:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 27
    .line 28
    iput-object p4, p0, Ldl2;->e:Lur3;

    .line 29
    .line 30
    iput-object p5, p0, Ldl2;->f:Ljava/util/List;

    .line 31
    .line 32
    iput-object p6, p0, Ldl2;->i:Ljava/util/List;

    .line 33
    .line 34
    iput-object p7, p0, Ldl2;->v:Lac1;

    .line 35
    .line 36
    iput-object p8, p0, Ldl2;->w:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p9, p0, Ldl2;->U:Ljava/util/List;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-boolean p2, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->z:Z

    .line 46
    .line 47
    xor-int/lit8 p2, p2, 0x1

    .line 48
    .line 49
    iput-boolean p2, p0, Ldl2;->V:Z

    .line 50
    .line 51
    iget-boolean p1, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 52
    .line 53
    iput-boolean p1, p0, Ldl2;->W:Z

    .line 54
    .line 55
    return-void
.end method

.method public static B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "\u202c \u202a("

    .line 2
    .line 3
    const-string v1, ")\u202c"

    .line 4
    .line 5
    const-string v2, "\u202b"

    .line 6
    .line 7
    invoke-static {v2, p0, v0, p1, v1}, Lfm0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final A(Lcl2;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p1, Lcl2;->j:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iget-object p0, p0, Ldl2;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lvv1;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v3, v3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->o:Ljava/lang/String;

    .line 21
    .line 22
    iget-boolean v4, p1, Lcl2;->e:Z

    .line 23
    .line 24
    const-string v5, "consent"

    .line 25
    .line 26
    invoke-direct {v1, v5, v3, v2, v4}, Lvv1;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-boolean v1, p1, Lcl2;->k:Z

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    new-instance v1, Lvv1;

    .line 37
    .line 38
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->p:Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean p1, p1, Lcl2;->f:Z

    .line 46
    .line 47
    const-string v3, "legitimateInterest"

    .line 48
    .line 49
    invoke-direct {v1, v3, p0, v2, p1}, Lvv1;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    return-object v0
.end method
