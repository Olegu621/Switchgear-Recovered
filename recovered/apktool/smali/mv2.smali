.class public final Lmv2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lnv2;


# direct methods
.method public synthetic constructor <init>(Lnv2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmv2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmv2;->b:Lnv2;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lmv2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lmv2;->b:Lnv2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lnv2;->b:Z

    .line 9
    .line 10
    iget-object p0, p0, Lnv2;->a:Lij;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lij;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/List;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p0, Lij;->b:Ljava/util/List;

    .line 20
    .line 21
    check-cast p0, Ljava/util/ArrayList;

    .line 22
    .line 23
    :goto_0
    return-object p0

    .line 24
    :pswitch_0
    sget-object v0, Lgt2;->Companion:Lft2;

    .line 25
    .line 26
    iget-object v1, p0, Lnv2;->a:Lij;

    .line 27
    .line 28
    iget-object v1, v1, Lij;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lr4;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, v1, Lr4;->b:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    :goto_1
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v1, 0x0

    .line 43
    :goto_2
    iget-object v2, p0, Lnv2;->c:Lkl;

    .line 44
    .line 45
    iget-object v3, p0, Lnv2;->h:Lhk2;

    .line 46
    .line 47
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/util/List;

    .line 52
    .line 53
    iget-object v4, p0, Lnv2;->e:Lew2;

    .line 54
    .line 55
    iget-object p0, p0, Lnv2;->d:Lec0;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2, v3, v4, p0}, Lft2;->b(ZLkl;Ljava/util/List;Lew2;Lec0;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
