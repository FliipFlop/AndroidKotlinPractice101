package com.example.androidkotlinpractice101.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidkotlinpractice101.R
import com.example.androidkotlinpractice101.model.DotaProPlayerModel
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(), IMainView {

    lateinit var presenter: MainPresenter
    lateinit var playerAdapter: PlayerAdapter

    companion object {
        fun newInstance(): MainFragment {
            var fragment: MainFragment = MainFragment()
            var args: Bundle = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = MainPresenter(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.loadPlayer()
    }

    override fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        progressBar.visibility = View.GONE
    }

    override fun showPlayerList(playerList: ArrayList<DotaProPlayerModel>?) {
        rvPlayerList.visibility = View.VISIBLE

        playerAdapter = PlayerAdapter(playerList)
        rvPlayerList.adapter = playerAdapter

        playerAdapter.notifyDataSetChanged()
    }

    override fun onRefreshPlayerList() {

    }

    override fun showLoadingResult(message: String?) {

    }
}