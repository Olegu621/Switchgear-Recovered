.class public final Lr1;
.super Lj;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr1;->b:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lj;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lr1;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;

    .line 7
    .line 8
    iget-object p0, p0, Lj;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lcom/google/android/gms/games/PlayerRef;

    .line 15
    .line 16
    iget-object p0, p0, Lj;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, Lcom/google/android/gms/games/event/EventRef;

    .line 23
    .line 24
    iget-object p0, p0, Lj;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lz30;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    new-instance v0, Lcom/google/android/gms/games/achievement/AchievementRef;

    .line 31
    .line 32
    iget-object p0, p0, Lj;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, Lz30;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
