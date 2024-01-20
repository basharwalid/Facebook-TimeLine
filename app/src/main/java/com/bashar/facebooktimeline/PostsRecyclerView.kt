package com.bashar.facebooktimeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bashar.facebooktimeline.databinding.ActivityPostsRecyclerViewBinding

class PostsRecyclerView : AppCompatActivity() {

    private lateinit var binding: ActivityPostsRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostsRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private lateinit var adapter: PostsRecyclerViewAdapter
    private fun initRecyclerView() {
        adapter = PostsRecyclerViewAdapter(createPostList())
        binding.rvContacts.adapter = adapter
    }

    private fun createPostList(): List<Post> {
        val postList = arrayListOf<Post>()
        for (i in 0..1000) {
            postList.add(
                Post(
                    name = "Unblast",
                    avatarID = R.drawable.circleavatar,
                    postImageID = R.drawable.postimagecontainer,
                    description = "Buckle UP, because change is coming to WordPress\nhttp://unblast.com/color-schemes",

                )
            )
        }
        return postList
    }
}